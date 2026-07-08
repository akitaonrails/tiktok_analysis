package com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom;

import X.C04J4;
import X.C0C64;
import X.C0OL2;
import X.C0OSB;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C419890GdH;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BulletinBottomBaseAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(getContentView(), viewGroup);
    }

    public final C419890GdH hp(BulletinBoardInfo bulletinBoardInfo) {
        TuxImageModel tuxImageModel;
        C419890GdH c419890GdHLJIIIIZZ;
        if (bulletinBoardInfo.accountType == C0OL2.BULLETIN_ACCOUNT_TYPE_LIVE_ARENA.getType() && (tuxImageModel = bulletinBoardInfo.accountIcon) != null && (c419890GdHLJIIIIZZ = C0OSB.LJIIIIZZ(tuxImageModel, LJJIJL().getContext())) != null) {
            c419890GdHLJIIIIZZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C426750GoL.LJ(LJJIJL()));
            return c419890GdHLJIIIIZZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static void ip(TextView textView, List list, String str, C419890GdH c419890GdH, Function1 function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ?? r2 = 0;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) obj;
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (a0.LJJJ(str, str2, length, r2, 4) != -1) {
                    int iLJJJ = a0.LJJJ(str, str2, length, r2, 4);
                    arrayList.add(Integer.valueOf(iLJJJ));
                    length = iLJJJ + str2.length();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    C786410Ut5.q2(spannableStringBuilder, new C04J4(i, (TextView) textView, function1, 1), iIntValue, str2.length() + iIntValue, 34);
                    if (c419890GdH != null) {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_board_arena_icon_setting", true, true)) {
                            spannableStringBuilder.insert(str2.length() + iIntValue, (CharSequence) " ");
                            C786410Ut5.q2(spannableStringBuilder, c419890GdH, str2.length() + iIntValue, iIntValue + str2.length() + 1, 34);
                        }
                        r2 = 0;
                    }
                }
                i = i2;
                r2 = r2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(r2);
        textView.setText(spannableStringBuilder);
    }
}
