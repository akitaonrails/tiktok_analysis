package com.ss.android.ugc.aweme.search.detail.keyframe.viewmodel;

import X.AnonymousClass0957;
import X.C01GW;
import X.C09MB;
import X.C0BY9;
import X.C0H8A;
import X.C0Q3E;
import X.C1155640gB8;
import X.C15438062q;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C452501pT;
import X.C655450PnL;
import X.C814420VxA;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.model.UrlStruct;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseSearchDetailKeyframeVM extends AssemViewModel<C1155640gB8> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(576));
    public IPlayerComponentAbility LLILLJJLI;
    public Aweme LLILLL;
    public List<SearchKeyFramePoint> LLILZ;

    public abstract void vQ2(int i, C0H8A c0h8a);

    public abstract void wQ2(int i, C0H8A c0h8a);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155640gB8(0);
    }

    public static boolean xQ2(SearchKeyFramePoint searchKeyFramePoint, long j) {
        if (C0BY9.LIZ()) {
            int iLIZIZ = C814420VxA.LIZIZ(j / 1000.0f);
            int i = searchKeyFramePoint.secondStart;
            if (iLIZIZ <= searchKeyFramePoint.secondEnd && i <= iLIZIZ) {
                return true;
            }
            return false;
        }
        if (((long) searchKeyFramePoint.secondStart) * 1000 <= j && j <= ((long) searchKeyFramePoint.secondEnd) * 1000) {
            return true;
        }
        return false;
    }

    public void yQ2(int i, C0H8A c0h8a) {
        long j = ((long) c0h8a.LLILLJJLI.secondStart) * 1000;
        IPlayerComponentAbility iPlayerComponentAbility = this.LLILLJJLI;
        if (iPlayerComponentAbility != null) {
            if (Long.valueOf(iPlayerComponentAbility.te()).longValue() != 0) {
                iPlayerComponentAbility.dO0(Math.min(100.0f, Math.max(0.0f, (j / r1.longValue()) * 100)));
                withState(new AwS52S0100100_18(this, j, 7));
            }
        }
    }

    public final void zQ2(Aweme aweme, List<SearchKeyFramePoint> list) {
        long currentPosition;
        Integer numValueOf;
        AnonymousClass0957 anonymousClass0957;
        if (aweme == null || list == null) {
            return;
        }
        this.LLILLL = aweme;
        this.LLILZ = list;
        if (!list.isEmpty()) {
            C0Q3E.LIZJ(aweme).Y30().LIZ(new C655450PnL(list));
        }
        IPlayerComponentAbility iPlayerComponentAbility = this.LLILLJJLI;
        if (iPlayerComponentAbility != null) {
            currentPosition = iPlayerComponentAbility.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        IPlayerComponentAbility iPlayerComponentAbility2 = this.LLILLJJLI;
        if (iPlayerComponentAbility2 != null) {
            iPlayerComponentAbility2.te();
        }
        Map mapLIZJ = C09MB.LIZJ(this, aweme, list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setupDataList] deferredMap size: ");
        if (mapLIZJ != null) {
            numValueOf = Integer.valueOf(mapLIZJ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", keyframe size: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (SearchKeyFramePoint searchKeyFramePoint : list) {
            int i2 = i + 1;
            if (i >= 0) {
                SearchKeyFramePoint searchKeyFramePoint2 = searchKeyFramePoint;
                if (mapLIZJ != null) {
                    mapLIZJ.get(searchKeyFramePoint2);
                }
                UrlStruct urlStruct = searchKeyFramePoint2.LIZ;
                if (urlStruct != null) {
                    urlStruct.getFirstUrl();
                }
                if (mapLIZJ != null) {
                    anonymousClass0957 = (AnonymousClass0957) mapLIZJ.get(searchKeyFramePoint2);
                } else {
                    anonymousClass0957 = null;
                }
                arrayList.add(new C0H8A(anonymousClass0957, searchKeyFramePoint2, xQ2(searchKeyFramePoint2, currentPosition)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        setStateImmediate(new AwS597S0100000_18(arrayList, (List<String>) 553));
    }
}
