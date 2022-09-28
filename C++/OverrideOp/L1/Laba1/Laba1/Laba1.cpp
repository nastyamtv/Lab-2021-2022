#include <iostream>
using namespace std;

class ItemNode {
public:
	char type;
	string name;
	string brand;
	int price;
	string producer;
	ItemNode* next;
	ItemNode* prevoius;
	ItemNode()
	{
		type = 'K';
		name = "Blouse";
		brand = "Everlane";
		price = 700;
		producer = "German";
	}
	ItemNode(char _t, string _n, string _b, int _p, string _pr)
	{
		type = _t;
		name = _n;
		brand = _b;
		price = _p;
		producer = _pr;
	}
	ItemNode(const ItemNode& o)
	{
		type = o.type;
		name = o.name;
		brand = o.brand;
		price = o.price;
		producer = o.producer;
	}

	~ItemNode() // деструктор
	{
	}
};
ostream& operator<< (std::ostream& out, const ItemNode& point)
{
	out << point.type <<" " << point.name <<" "<<point.brand << " " << point.price << " " << point.producer;
	return out;
}
istream& operator>> (std::istream& in, ItemNode& point)
{
	in >> point.type >> point.name >> point.brand >> point.price >> point.producer;
	return in;
}
class ItemList
{
public:
	ItemNode* head;
	ItemNode* tail;
	int count;

	void push_end(ItemNode* item) {

		if (count != 0)
		{
			item->prevoius = tail;
			tail->next = item;
			tail = item;
		}
		else
		{
			head = item;
			tail = item;
		}
		count++;
	}
};

ostream& operator<< (std::ostream& out, const ItemList& list)
{
	ItemNode* current = list.head;
	while (current != NULL)
	{
		out << (*current) << endl;
		current = current->next;
	}
	return out;
}

void delete_finish(ItemList& list)
{
	list.tail = (list.tail)->prevoius;
	list.tail->next = NULL;
	list.count--;
}


int main()
{

	ItemList list = ItemList();

	cout << "Enter list values" << endl;
	while (true)
	{
		ItemNode* item = new ItemNode();
		cin >> *item;
		if ((*item).type == '0')
			break;
		else
		{
			list.push_end(item);
		}
	}
	cout << "press 1 - add one element" << endl;
	cout << "press 2 - delete element" << endl;
	cout << "press 3 - print on desktop" << endl;
	cout << "press 4 - to exit" << endl;


	cout << "Enter 0 to finish:" << endl;
	ItemNode* item2 = new ItemNode();
	while (true)
	{
		int x;
		cout << "Enter menu option" << endl;
		std::cin >> x;
		if (x == 0)
			break;
		switch (x) {
		case 1:

			cin >> *item2;
			list.push_end(item2);
			break;

		case 2:
			delete_finish(list);
			break;
		case 3:
			cout << list;
			break;
		case 4:
			cout << "Exit\n";
			break;
		default:
			cout << "You entered an incorrect character\n";
		}
		if (x == 4)
		{
			break;
		}
		cout << "press any botton: ";

	}
}
