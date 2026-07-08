package com.google.android.material.datepicker;

import X.AbstractC21562119Zz;
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
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.datepicker.RangeDateSelector;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: loaded from: classes34.dex */
public class RangeDateSelector implements DateSelector<C0WIY<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: X.19aN
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    };
    public final String invalidRangeEndError = " ";
    public String invalidRangeStartError;
    public Long proposedTextEnd;
    public Long proposedTextStart;
    public Long selectedEndItem;
    public Long selectedStartItem;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean Vk() {
        Long l = this.selectedStartItem;
        return (l == null || this.selectedEndItem == null || l.longValue() > this.selectedEndItem.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<Long> Vy() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<C0WIY<Long, Long>> aq() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0WIY(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final C0WIY<Long, Long> cL() {
        return new C0WIY<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void Tl(long j) {
        Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem == null && l.longValue() <= j) {
            this.selectedEndItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int iv(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.a96)) {
            i = R.attr.f3o;
        } else {
            i = R.attr.f3d;
        }
        return C19PF.LIZIZ(context, i, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String jd(Context context) {
        C0WIY c0wiy;
        Resources resources = context.getResources();
        Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(2131837559);
        }
        Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(2131837556, C21564419aM.LIZ(l.longValue()));
        }
        if (l == null) {
            return resources.getString(2131837555, C21564419aM.LIZ(l2.longValue()));
        }
        Calendar calendarLJII = C21565019aS.LJII();
        Calendar calendarLJIIIIZZ = C21565019aS.LJIIIIZZ(null);
        calendarLJIIIIZZ.setTimeInMillis(l.longValue());
        Calendar calendarLJIIIIZZ2 = C21565019aS.LJIIIIZZ(null);
        calendarLJIIIIZZ2.setTimeInMillis(l2.longValue());
        if (calendarLJIIIIZZ.get(1) == calendarLJIIIIZZ2.get(1)) {
            if (calendarLJIIIIZZ.get(1) == calendarLJII.get(1)) {
                c0wiy = new C0WIY(C21564419aM.LIZIZ(l.longValue(), Locale.getDefault()), C21564419aM.LIZIZ(l2.longValue(), Locale.getDefault()));
            } else {
                c0wiy = new C0WIY(C21564419aM.LIZIZ(l.longValue(), Locale.getDefault()), C21564419aM.LIZJ(l2.longValue(), Locale.getDefault()));
            }
        } else {
            c0wiy = new C0WIY(C21564419aM.LIZJ(l.longValue(), Locale.getDefault()), C21564419aM.LIZJ(l2.longValue(), Locale.getDefault()));
        }
        return resources.getString(2131837557, c0wiy.LIZ, c0wiy.LIZIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    public final void LIZ(C21543419Su c21543419Su, C21543419Su c21543419Su2, AbstractC21562119Zz<C0WIY<Long, Long>> abstractC21562119Zz) {
        Long l = this.proposedTextStart;
        if (l != null && this.proposedTextEnd != null) {
            if (l.longValue() <= this.proposedTextEnd.longValue()) {
                Long l2 = this.proposedTextStart;
                this.selectedStartItem = l2;
                Long l3 = this.proposedTextEnd;
                this.selectedEndItem = l3;
                abstractC21562119Zz.LIZIZ(new C0WIY<>(l2, l3));
                return;
            }
            c21543419Su.setError(this.invalidRangeStartError);
            c21543419Su2.setError(" ");
            abstractC21562119Zz.LIZ();
            return;
        }
        if (c21543419Su.getError() != null && this.invalidRangeStartError.contentEquals(c21543419Su.getError())) {
            c21543419Su.setError(null);
        }
        if (c21543419Su2.getError() != null && " ".contentEquals(c21543419Su2.getError())) {
            c21543419Su2.setError(null);
        }
        abstractC21562119Zz.LIZ();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View Rw(LayoutInflater layoutInflater, ViewGroup viewGroup, final CalendarConstraints calendarConstraints, final C21562019Zy c21562019Zy) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dpc, viewGroup, false);
        final C21543419Su c21543419Su = (C21543419Su) viewTd.findViewById(R.id.on3);
        final C21543419Su c21543419Su2 = (C21543419Su) viewTd.findViewById(R.id.on2);
        EditText editText = c21543419Su.getEditText();
        EditText editText2 = c21543419Su2.getEditText();
        if (C1286460ja8.LIZ()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewTd.getResources().getString(2131837552);
        final SimpleDateFormat simpleDateFormatLJFF = C21565019aS.LJFF();
        Long l = this.selectedStartItem;
        if (l != null) {
            editText.setText(simpleDateFormatLJFF.format(l));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            editText2.setText(simpleDateFormatLJFF.format(l2));
            this.proposedTextEnd = this.selectedEndItem;
        }
        final String strLJI = C21565019aS.LJI(viewTd.getResources(), simpleDateFormatLJFF);
        c21543419Su.setPlaceholderText(strLJI);
        c21543419Su2.setPlaceholderText(strLJI);
        editText.addTextChangedListener(new AbstractC21564019aI(strLJI, simpleDateFormatLJFF, c21543419Su, calendarConstraints) { // from class: X.19aP
            @Override // X.AbstractC21564019aI
            public final void LIZ() {
                RangeDateSelector rangeDateSelector = this.LLJI;
                rangeDateSelector.proposedTextStart = null;
                rangeDateSelector.LIZ(c21543419Su, c21543419Su2, c21562019Zy);
            }

            @Override // X.AbstractC21564019aI
            public final void LIZIZ(Long l3) {
                RangeDateSelector rangeDateSelector = this.LLJI;
                rangeDateSelector.proposedTextStart = l3;
                rangeDateSelector.LIZ(c21543419Su, c21543419Su2, c21562019Zy);
            }
        });
        editText2.addTextChangedListener(new AbstractC21564019aI(strLJI, simpleDateFormatLJFF, c21543419Su2, calendarConstraints) { // from class: X.19aQ
            @Override // X.AbstractC21564019aI
            public final void LIZ() {
                RangeDateSelector rangeDateSelector = this.LLJI;
                rangeDateSelector.proposedTextEnd = null;
                rangeDateSelector.LIZ(c21543419Su, c21543419Su2, c21562019Zy);
            }

            @Override // X.AbstractC21564019aI
            public final void LIZIZ(Long l3) {
                RangeDateSelector rangeDateSelector = this.LLJI;
                rangeDateSelector.proposedTextEnd = l3;
                rangeDateSelector.LIZ(c21543419Su, c21543419Su2, c21562019Zy);
            }
        });
        editText.requestFocus();
        HandlerHook.viewPost(editText, new C0DIN(editText));
        return viewTd;
    }
}
