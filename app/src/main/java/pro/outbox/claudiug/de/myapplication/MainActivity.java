package pro.outbox.claudiug.de.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);

        List<Contact> contactList = getContacts();
        ContactsAdapter contactsAdapter = new ContactsAdapter(contactList);
        recyclerView.setAdapter(contactsAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        linearLayoutManager.scrollToPosition(0);
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        //decorators
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        recyclerView.addItemDecoration(itemDecoration);


    }

    @NonNull
    private List<Contact> getContacts() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        contactList.add(new Contact("claudiu", false));
        contactList.add(new Contact("raluca", true));
        return contactList;
    }
}
