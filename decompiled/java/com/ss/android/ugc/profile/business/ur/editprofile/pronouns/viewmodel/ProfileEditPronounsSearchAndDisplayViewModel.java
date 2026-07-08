package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel;

import X.AbstractC426530Gnz;
import X.C0WZX;
import X.C1216270hkv;
import X.C13BV;
import X.C1777810wMd;
import X.C2204961BRm;
import X.C233600vG;
import X.C430750Gun;
import X.C434230H0z;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileEditPronounsSearchAndDisplayViewModel extends AssemViewModel<C233600vG> {
    public Boolean LLILZLL;
    public int LLJI;
    public final SpannableStringBuilder LL = new SpannableStringBuilder();
    public final List<String> LLILLJJLI = new ArrayList();
    public final Map<C1777810wMd, List<String>> LLILLL = new LinkedHashMap();
    public List<String> LLILZ = C13BV.INSTANCE;
    public int LLILZIL = 4;
    public final int LLIZ = Integer.MAX_VALUE;
    public boolean LLIZLLLIL = true;
    public final Map<Integer, Integer> LLJ = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C233600vG(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((LinkedHashMap) this.LLILLL).clear();
        super.onCleared();
    }

    public static void yQ2(int i, final View view) {
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        final int i2 = layoutParams.topMargin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06Z2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.topMargin = i2 + iIntValue;
                C786410Ut5.W5(view, layoutParams);
            }
        });
        valueAnimatorOfInt.start();
    }

    public final void vQ2(View view, boolean z) {
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
            return;
        }
        if (z) {
            if (this.LLIZLLLIL) {
                return;
            }
            this.LLIZLLLIL = true;
            yQ2(view.getHeight(), view);
            return;
        }
        if (!this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = false;
        yQ2(-view.getHeight(), view);
    }

    public final boolean wQ2(EditText editText, int i) throws Throwable {
        if (C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZ1huEZE9mLdm0t02dv6hflrcf2zthm2FqEy8Tj0b5JLa7WYQQNBhShCdHBqL8WywTCNFkLEq", null)).length() > i) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZ1huEZE9mLdm0t02dv6hflrcf2zthm2FqEy8Tj0b5JLa7WYQQNBhShCdHBqL8WywTCNFkLEq", null));
            int selectionEnd = Selection.getSelectionEnd(editableLLJILLL);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.LL).append((CharSequence) editableLLJILLL.subSequence(this.LL.length(), i).toString());
            editText.setText(spannableStringBuilder);
            Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1fcRSL+J94uApqhXuGi3EdBRZ1huEZE9mLdm0t02dv6hflrcf2zthm2FqEy8Tj0b5JLa7WYQQNBhShCdHBqL8WywTCNFkLEq", null));
            if (selectionEnd > editableLLJILLL2.length()) {
                selectionEnd = editableLLJILLL2.length();
            }
            Selection.setSelection(editableLLJILLL2, selectionEnd);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0GnU, android.view.View] */
    public final void xQ2(final Context context, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.LL.append((CharSequence) "*");
            ((ArrayList) this.LLILLJJLI).add(ListProtector.get(list, i));
            String str = (String) ListProtector.get(list, i);
            ?? r1 = new LinearLayout(context) { // from class: X.0GnU
                public TuxTextView LL;

                public final TuxTextView getPronounsDescFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.sde);
                        this.LL = (TuxTextView) callbackFindViewById;
                    }
                    return (TuxTextView) callbackFindViewById;
                }

                {
                    int i2;
                    if (C1EDI.LJ()) {
                        i2 = R.layout.ei9;
                    } else {
                        i2 = R.layout.ei8;
                    }
                    C786410Ut5.Sd(i2, C786410Ut5.ne(getContext()), this);
                }

                public final void setPronounsDescFromXml(TuxTextView tuxTextView) {
                    this.LL = tuxTextView;
                }
            };
            r1.getPronounsDescFromXml().setText(str);
            C430750Gun c430750Gun = new C430750Gun(r1);
            c430750Gun.LLILLL = C1216270hkv.LIZIZ(8);
            final int i2 = this.LLJI;
            this.LLJI = i2 + 1;
            this.LLJ.put(Integer.valueOf(i2), Integer.valueOf(this.LL.length() - 1));
            AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0znj
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    int iIntValue;
                    Integer num = (Integer) ((LinkedHashMap) this.LL.LLJ).get(Integer.valueOf(i2));
                    if (num != null) {
                        num.intValue();
                        Iterator it2 = ((LinkedHashMap) this.LL.LLJ).keySet().iterator();
                        while (true) {
                            int iIntValue2 = -1;
                            if (it2.hasNext()) {
                                int iIntValue3 = ((Number) it2.next()).intValue();
                                Integer num2 = (Integer) ((LinkedHashMap) this.LL.LLJ).get(Integer.valueOf(iIntValue3));
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                if (iIntValue > num.intValue()) {
                                    Map<Integer, Integer> map = this.LL.LLJ;
                                    Integer numValueOf = Integer.valueOf(iIntValue3);
                                    Integer num3 = (Integer) ((LinkedHashMap) this.LL.LLJ).get(Integer.valueOf(iIntValue3));
                                    if (num3 != null) {
                                        iIntValue2 = num3.intValue();
                                    }
                                    map.put(numValueOf, Integer.valueOf(iIntValue2 - 1));
                                }
                            } else {
                                this.LL.LL.delete(num.intValue(), num.intValue() + 1);
                                ListProtector.remove(this.LL.LLILLJJLI, num.intValue());
                                this.LL.LLJ.put(Integer.valueOf(i2), -1);
                                ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel = this.LL;
                                profileEditPronounsSearchAndDisplayViewModel.withState(new AwS607S0100000_28(profileEditPronounsSearchAndDisplayViewModel, 227));
                                return;
                            }
                        }
                    }
                }
            };
            int length = this.LL.length() - 1;
            int length2 = this.LL.length();
            C786410Ut5.q2(this.LL, c430750Gun, length, length2, 33);
            C786410Ut5.q2(this.LL, abstractC426530Gnz, length, length2, 33);
        }
        C786410Ut5.q2(this.LL, new C434230H0z(71), 0, this.LL.length(), 33);
    }
}
