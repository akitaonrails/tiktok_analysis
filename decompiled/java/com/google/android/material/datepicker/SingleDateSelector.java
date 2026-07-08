package com.google.android.material.datepicker;

import X.AbstractC21564019aI;
import X.C0DIN;
import X.C0WIY;
import X.C1286460ja8;
import X.C19PF;
import X.C21543419Su;
import X.C21562019Zy;
import X.C21564419aM;
import X.C21565019aS;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.datepicker.SingleDateSelector;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: X.19aO
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };
    public Long selectedItem;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean Vk() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<Long> Vy() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<C0WIY<Long, Long>> aq() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final /* bridge */ /* synthetic */ Long cL() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void Tl(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int iv(Context context) {
        return C19PF.LIZIZ(context, R.attr.f3o, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String jd(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(2131837547);
        }
        return resources.getString(2131837545, C21564419aM.LIZJ(l.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View Rw(LayoutInflater layoutInflater, ViewGroup viewGroup, final CalendarConstraints calendarConstraints, final C21562019Zy c21562019Zy) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dpb, viewGroup, false);
        final C21543419Su c21543419Su = (C21543419Su) viewTd.findViewById(R.id.on1);
        EditText editText = c21543419Su.getEditText();
        if (C1286460ja8.LIZ()) {
            editText.setInputType(17);
        }
        final SimpleDateFormat simpleDateFormatLJFF = C21565019aS.LJFF();
        final String strLJI = C21565019aS.LJI(viewTd.getResources(), simpleDateFormatLJFF);
        c21543419Su.setPlaceholderText(strLJI);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(simpleDateFormatLJFF.format(l));
        }
        editText.addTextChangedListener(new AbstractC21564019aI(strLJI, simpleDateFormatLJFF, c21543419Su, calendarConstraints) { // from class: X.19aL
            @Override // X.AbstractC21564019aI
            public final void LIZ() {
                c21562019Zy.LIZ();
            }

            @Override // X.AbstractC21564019aI
            public final void LIZIZ(Long l2) {
                if (l2 == null) {
                    this.LLIZLLLIL.selectedItem = null;
                } else {
                    this.LLIZLLLIL.Tl(l2.longValue());
                }
                c21562019Zy.LIZIZ(this.LLIZLLLIL.selectedItem);
            }
        });
        editText.requestFocus();
        HandlerHook.viewPost(editText, new C0DIN(editText));
        return viewTd;
    }
}
