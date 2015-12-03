package com.kenennethtucker.taoteching;
import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by ken on 12/2/15.
 */
public class CircularArrayAdapter<T> extends ArrayAdapter
{

    public static final int HALF_MAX_VALUE = Integer.MAX_VALUE/2;
    public final int MIDDLE;
    private T[] objects;

    public CircularArrayAdapter(Context context, int textViewResourceId, T[] objects)
    {
        super(context, textViewResourceId, objects);
        this.objects = objects;
        MIDDLE = HALF_MAX_VALUE - HALF_MAX_VALUE % objects.length;
    }

    @Override
    public int getCount()
    {
        return Integer.MAX_VALUE;
    }

    @Override
    public T getItem(int position)
    {
        return objects[position % objects.length];
    }
}