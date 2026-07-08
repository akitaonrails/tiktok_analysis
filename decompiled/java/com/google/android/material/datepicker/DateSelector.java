package com.google.android.material.datepicker;

import X.C0WIY;
import X.C21562019Zy;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* JADX INFO: loaded from: classes34.dex */
public interface DateSelector<S> extends Parcelable {
    View Rw(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C21562019Zy c21562019Zy);

    void Tl(long j);

    boolean Vk();

    Collection<Long> Vy();

    Collection<C0WIY<Long, Long>> aq();

    S cL();

    int iv(Context context);

    String jd(Context context);
}
