package com.ss.android.ugc.aweme.selector.choosegroup;

import X.AbstractC1223800hx4;
import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C09IC;
import X.C09IR;
import X.C1219950hqr;
import X.C1223780hx2;
import X.C1223790hx3;
import X.C1228400i4U;
import X.C1228410i4V;
import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import webcast.api.fans.GroupInviteItem;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupChooseGroupViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final AnonymousClass0950 LLILZ;
    public final C2252331DDr LLILZIL;
    public final AnonymousClass0950 LLILZLL;
    public C1228410i4V LLIZ;

    public final void refresh() {
        C1228410i4V c1228410i4V = this.LLIZ;
        if (c1228410i4V == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1228400i4U(this, c1228410i4V, null), 3);
    }

    public FanGroupChooseGroupViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1219950hqr(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 4, null, 4);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 4, null, 4);
        this.LLILZIL = c2252331DDrLIZIZ2;
        this.LLILZLL = C09IC.LIZ(c2252331DDrLIZIZ2);
    }

    public static List vQ2(Context context, List list, Long l) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (true ^ ((GroupInviteItem) obj).isHidden) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        if (list2.isEmpty() && list3.isEmpty()) {
            return C13BV.INSTANCE;
        }
        arrayList.add(new C1223790hx3(context.getString(2131831863), (C1223780hx2) null, 6));
        if (!list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(wQ2((GroupInviteItem) it2.next(), false, l));
            }
        } else {
            arrayList.add(new AbstractC1223800hx4() { // from class: X.0hz7
                @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return interfaceC1891350zJl instanceof C1225070hz7;
                }

                @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return interfaceC1891350zJl instanceof C1225070hz7;
                }
            });
        }
        if (!list3.isEmpty()) {
            arrayList.add(new C1223790hx3(context.getString(2131831857), (C1223780hx2) null, 6));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(wQ2((GroupInviteItem) it3.next(), true, l));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1225220hzM wQ2(webcast.api.fans.GroupInviteItem r10, boolean r11, java.lang.Long r12) {
        /*
            int r0 = r10.memberCount
            if (r0 <= 0) goto L54
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r10.groupName
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            int r0 = r10.memberCount
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
        L20:
            java.lang.String r6 = r10.displayThresholdText
            if (r11 != 0) goto L51
            boolean r0 = r10.disabled
            if (r0 != 0) goto L51
            r7 = 1
            long r0 = r10.conversationShortId
            if (r12 == 0) goto L52
            long r3 = r12.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L52
            r9 = 1
        L36:
            long r2 = r10.conversationShortId
            java.lang.String r4 = r10.avatarUrl
            int r0 = r6.length()
            if (r0 > 0) goto L41
            r6 = 0
        L41:
            if (r11 != 0) goto L4f
            boolean r0 = r10.disabled
            if (r0 == 0) goto L4f
            r10 = 1
        L48:
            X.0hzM r1 = new X.0hzM
            r8 = r7
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L4f:
            r10 = 0
            goto L48
        L51:
            r7 = 0
        L52:
            r9 = 0
            goto L36
        L54:
            java.lang.String r5 = r10.groupName
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel.wQ2(webcast.api.fans.GroupInviteItem, boolean, java.lang.Long):X.0hzM");
    }
}
