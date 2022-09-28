#include <iostream>
using namespace std;

class ItemNode {
public:
	double v;
	ItemNode* next;
	ItemNode* prevoius;
	ItemNode()
	{
		v = 1.0;
	}
	ItemNode(double _v)
	{
		v = _v;
	}
	ItemNode(const ItemNode& o)
	{
		v = o.v;
	}

	~ItemNode() // деструктор
	{
	}
};
ostream& operator<< (std::ostream& out, const ItemNode& point)
{
	out << point.v;
	return out;
}
istream& operator>> (std::istream& in, ItemNode& point)
{
	in >> point.v;
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

void Clear(ItemList& list)
{
	ItemNode* v1 = list.head;
	ItemNode* v2 = list.head;
	//for (int i = 0; i < list.count; i++)
	while (v1 != NULL)
	{
		v2 = v1->next;
		delete v1;
		v1 = v2;
	}
	list.count = 0;
}
void delete_finish(ItemList& list)
{
	list.tail = (list.tail)->prevoius;
	list.tail->next = NULL;
	list.count--;
}

void printOnDesktop(ItemList& list)
{
	if (list.count!=0)
	{

		ItemNode* current = list.head;
		while (current != NULL) {
			cout << left << current->v << "\n";
			current = current->next;
		}
	}
	else
	{
		cout << "there are no items in the list"<<endl;
	}
}
void arithmeticMean(ItemList& list)
{
	double temp=0;
	if (list.count != 0)
	{
		ItemNode* current = list.head;
		while (current != NULL) {
			temp+= current->v;
			current = current->next;
		}
	}
	else
	{
		cout << "there are no items in the list" << endl;
	}
	cout << "arithmetic mean: " <<temp*1.0/list.count<< endl;
}

void change(ItemList& list, double a, double b)
{
	if (list.count != 0)
	{
		ItemNode* current = list.head;
		while (current != NULL) {
			if (current->v== a)
			{
				current->v=b;
			}
			current = current->next;
		}
	}
	else
	{
		cout << "there are no items in the list" << endl;
	}
}

int main()
{

	ItemList list = ItemList();

	cout << "Enter list values" << endl;
	while (true)
	{
		ItemNode* item = new ItemNode();
		cin >> *item;
		if ((*item).v == 0)
			break;
		else
		{
			list.push_end(item);
		}
	}
	cout << "press 1 - add one element" << endl;
	cout << "press 2 - delete element" << endl;
	cout << "press 3 - print on desktop" << endl;
	cout << "press 4 - delete list" << endl;
	cout << "press 5 - find arithmetic mean" << endl;
	cout << "press 6 - change x to y" << endl;
	cout << "press 7 - to exit" << endl;

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
			printOnDesktop(list);
			//cout << list;
			break;
		case 4:
			Clear(list);
			break;
		case 5:
			arithmeticMean(list);
			break;
		case 6:
			double x,y ;
			cout << "Enter x and y:"<< endl;
			cin >> x >> y;
			change(list, x,y);
			break;
		case 7:
			cout << "Exit\n";
			break;
		default:
			cout << "You entered an incorrect character\n";
		}
		if (x == 7)
		{
			break;
		}
		cout << "press any botton: ";

	}
}
