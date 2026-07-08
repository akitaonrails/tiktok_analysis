package com.ss.android.ugc.profile.business.ur.ui;

import X.C01GW;
import X.C2188811AlT;
import X.C2246381Cw8;
import X.C444920HcY;
import X.C452501pT;
import X.InterfaceC0148002o;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class ProfileEditBioViewModel extends AssemViewModel<C2246381Cw8> {
    public final int LL = 30;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(526));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2246381Cw8(0);
    }

    public static String vQ2(Editable editable) {
        if (editable.length() == 0) {
            return "";
        }
        char[] cArr = new char[editable.length()];
        TextUtils.getChars(editable, 0, editable.length(), cArr, 0);
        return new String(cArr);
    }

    public static MentionSpan[] wQ2(final Editable editable) {
        if (editable.length() == 0) {
            return new MentionSpan[0];
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new Comparator() { // from class: X.1CwD
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
            }
        });
        return mentionSpanArr;
    }

    public static boolean yQ2(String str) {
        if (a0.LJJLIIIJILLIZJL(str, new String[]{"\n"}, 0, 6).size() <= 5) {
            return false;
        }
        return true;
    }

    public static void zQ2(Editable editable, Editable editable2) {
        int iLJJJ;
        int length;
        MentionSpan[] mentionSpanArrWQ2 = wQ2(editable);
        int i = 0;
        for (MentionSpan mentionSpan : mentionSpanArrWQ2) {
            String strLIZIZ = mentionSpan.LIZIZ();
            if (strLIZIZ != null && (iLJJJ = a0.LJJJ(editable2, strLIZIZ, i, false, 4)) >= 0 && editable2.charAt(iLJJJ) == '@' && (length = strLIZIZ.length() + iLJJJ) <= editable2.length()) {
                editable2.setSpan(mentionSpan, iLJJJ, length, 33);
                editable2.setSpan(new C444920HcY(42, false), iLJJJ, length, 33);
                i = length + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(int r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel.AQ2(int, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String BQ2(android.text.Editable r9, int r10, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r11) {
        /*
            r8 = this;
            int r0 = r9.length()
            r4 = 0
            if (r0 != 0) goto L93
            r0 = 1
        L8:
            r3 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L91
            if (r10 == 0) goto L91
            int r0 = r10 + (-1)
            char r0 = r9.charAt(r0)
            r7 = 64
            if (r0 != r7) goto L3a
            r5 = r2
        L1a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            if (r0 == 0) goto L96
            X.15lH r1 = X.C20612915lH.LIZIZ
            X.0Cb4 r0 = r1.LJIIIIZZ()
            boolean r0 = r0.LJFF(r3)
            if (r0 == 0) goto L96
            if (r11 == 0) goto L39
            X.0Cb4 r0 = r1.LJIIIIZZ()
            java.lang.String r0 = r0.LIZLLL()
            r11.invoke(r0)
        L39:
            return r5
        L3a:
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r4, r10)
            X.0Kt9 r6 = r0.iterator()
            r5 = r3
        L43:
            boolean r0 = r6.LLILLL
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r6.next()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            char r0 = r9.charAt(r0)
            if (r0 != r7) goto L43
            r5 = r1
            goto L43
        L5a:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L91
            int r1 = r5.intValue()
            java.lang.Class<com.ss.android.ugc.aweme.comment.widgets.MentionSpan> r0 = com.ss.android.ugc.aweme.comment.widgets.MentionSpan.class
            java.lang.Object[] r0 = r9.getSpans(r1, r10, r0)
            com.ss.android.ugc.aweme.comment.widgets.MentionSpan[] r0 = (com.ss.android.ugc.aweme.comment.widgets.MentionSpan[]) r0
            if (r0 == 0) goto L91
            int r0 = r0.length
            if (r0 != 0) goto L91
            int r0 = r1 + 1
            java.lang.CharSequence r0 = r9.subSequence(r0, r10)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "  "
            boolean r0 = kotlin.text.a0.LJJIIZI(r5, r0, r4)
            if (r0 != 0) goto L91
            r0 = 10
            boolean r0 = kotlin.text.a0.LJJIJ(r5, r0)
            if (r0 != 0) goto L91
            int r1 = r5.length()
            int r0 = r8.LL
            if (r1 <= r0) goto L1a
        L91:
            r5 = r3
            goto L1a
        L93:
            r0 = 0
            goto L8
        L96:
            kotlin.jvm.internal.AwS84S1000000_34 r1 = new kotlin.jvm.internal.AwS84S1000000_34
            r0 = 3
            r1.<init>(r5, r0)
            r8.setStateImmediate(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel.BQ2(android.text.Editable, int, kotlin.jvm.functions.Function1):java.lang.String");
    }

    public final Editable xQ2(Editable editable, User user, int i) {
        int length;
        int length2;
        String strBQ2 = BQ2(editable, i, null);
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(editable);
        int length3 = editableNewEditable.length();
        if (strBQ2 != null) {
            length = strBQ2.length();
        } else {
            length = 0;
        }
        if ((length3 - length) + user.getNickname().length() > ProfileEditBioFragment.LLJJIII) {
            setStateImmediate(AFwS281S0000000_34.get$arr$(34));
            return editableNewEditable;
        }
        if (wQ2(editableNewEditable).length >= 10) {
            setState(AFwS281S0000000_34.get$arr$(35));
            return editableNewEditable;
        }
        if (strBQ2 == null) {
            length2 = 0;
        } else {
            editableNewEditable.delete(i - strBQ2.length(), i);
            length2 = strBQ2.length();
        }
        int i2 = i - length2;
        String nickname = user.getNickname();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(nickname);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(editableNewEditable)) {
            editableNewEditable.insert(0, spannableString);
            editableNewEditable.append((CharSequence) " ");
        } else {
            int length4 = editableNewEditable.length();
            if (i2 >= 0 && i2 <= length4) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (editableNewEditable.charAt(i3) == '@') {
                        editableNewEditable.delete(i3, i2);
                        i2 = i3;
                    }
                }
                editableNewEditable.insert(i2, spannableString);
                editableNewEditable.insert(Math.min(i2 + spannableString.length(), editableNewEditable.length()), " ");
            }
        }
        this.vmDispatcher.getState();
        setStateImmediate(new AwS400S0200000_34(this, editableNewEditable, 9));
        return editableNewEditable;
    }
}
