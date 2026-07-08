package com.ss.android.ugc.aweme.mix.choose;

import X.C01GW;
import X.C1158260gFM;
import X.C1165050gQJ;
import X.C1168070gVB;
import X.C1168510gVt;
import X.C1168550gVx;
import X.C1169160gWw;
import X.C1169360gXG;
import X.C11S5;
import X.C1559260qg8;
import X.C1701940uOG;
import X.C259800zU;
import X.C291001Au;
import X.C298660BnE;
import X.C452501pT;
import X.C723600SZy;
import X.C735280Sso;
import X.EnumC1163900gOS;
import X.InterfaceC0148002o;
import X.InterfaceC1168520gVu;
import X.InterfaceC1168540gVw;
import Y.AfS100S0300000_2;
import Y.AfS138S0200000_2;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS0S2010000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistChoosePanelViewModel extends AssemViewModel<C1168510gVt> {
    public InterfaceC1168540gVw LLILLL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1158260gFM.class, null), true);
    public final C1165050gQJ LLILLJJLI = new C1165050gQJ();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 443));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 905));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1168510gVt("", "", new C291001Au(Boolean.FALSE), new C291001Au("Loading"), false, new C291001Au(""), "");
    }

    public final void refresh() {
        setStateImmediate(AFwS256S0000000_18.get$arr$(138));
        ((PowerPageSource) this.LLILZIL.getValue()).getOperator().refresh();
    }

    public final C1158260gFM yQ2() {
        return (C1158260gFM) this.LL.getValue();
    }

    public final Integer xQ2() {
        Aweme aweme;
        C1158260gFM c1158260gFMYQ2 = yQ2();
        if (c1158260gFMYQ2 == null || (aweme = c1158260gFMYQ2.LLILZIL) == null) {
            return null;
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJI(aweme) || (C298660BnE.LIZ() && aweme.isSubOnlyVideo())) {
            return null;
        }
        return aweme.isSubOnlyVideo() ? 2131849242 : 2131850548;
    }

    public final List<C1168070gVB> wQ2(List<MixStruct> list) {
        boolean z;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        C1158260gFM c1158260gFMYQ2 = yQ2();
        if (c1158260gFMYQ2 != null) {
            z = c1158260gFMYQ2.LLILLL;
        } else {
            z = false;
        }
        if (list != null) {
            for (MixStruct mixStruct : list) {
                C1168510gVt c1168510gVt = (C1168510gVt) this.vmDispatcher.getState();
                String mixName = mixStruct.getMixName();
                UrlModel icon = mixStruct.getIcon();
                MixStatisStruct statis = mixStruct.getStatis();
                if (statis != null) {
                    numValueOf = Integer.valueOf(statis.getTotal());
                } else {
                    numValueOf = null;
                }
                String str = mixStruct.mixId;
                C1168070gVB c1168070gVB = new C1168070gVB(Intrinsics.LJFF(str, c1168510gVt.LL), mixName, icon, numValueOf, str, mixStruct.getMixLabel(), !z);
                if (Intrinsics.LJFF(c1168510gVt.LL, mixStruct.mixId)) {
                    ListProtector.add(arrayList, 0, c1168070gVB);
                } else {
                    arrayList.add(c1168070gVB);
                }
            }
        }
        return arrayList;
    }

    public final void zQ2(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "exist";
        } else {
            str = "new";
        }
        C1168510gVt c1168510gVt = (C1168510gVt) this.vmDispatcher.getState();
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String str3 = c1168510gVt.LL;
        C1158260gFM c1158260gFMYQ2 = yQ2();
        if (c1158260gFMYQ2 == null || (str2 = c1158260gFMYQ2.LL) == null) {
            str2 = "";
        }
        c1169160gWw.getClass();
        C1169160gWw.LJ(str3, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.01kM] */
    public final void vQ2(String str, String str2, String str3) {
        Aweme aweme;
        String aid;
        C1158260gFM c1158260gFMYQ2 = yQ2();
        if (c1158260gFMYQ2 != null) {
            aweme = c1158260gFMYQ2.LLILZIL;
        } else {
            aweme = null;
        }
        String string = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1165050gQJ c1165050gQJ = this.LLILLJJLI;
        List listSingletonList = Collections.singletonList(aid);
        C1168550gVx c1168550gVx = new C1168550gVx(this, str, str2, aweme, str3, aid);
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 125);
        c1165050gQJ.getClass();
        C259800zU c259800zU = new C259800zU();
        MixFeedApi.LIZ.getClass();
        MixFeedApi mixFeedApiLIZ = C1169360gXG.LIZ();
        int operation = EnumC1163900gOS.VIDEOADD.getOperation();
        if (!listSingletonList.isEmpty()) {
            StringBuilder sb = new StringBuilder(e3.e);
            Iterator it2 = listSingletonList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                sb.append((String) it2.next());
                if (i != listSingletonList.size() - 1) {
                    sb.append(",");
                } else {
                    sb.append(e3.f);
                }
                i = i2;
            }
            string = sb.toString();
        }
        c259800zU.element = mixFeedApiLIZ.manageMixFeed(operation, str, "", string, "", "", null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS100S0300000_2(c1168550gVx, awS597S0100000_18, c259800zU, 1), new AfS138S0200000_2(awS597S0100000_18, c259800zU, 5));
    }

    public final void AQ2(String str, int i, String str2, boolean z, boolean z2) {
        InterfaceC1168540gVw interfaceC1168540gVw = this.LLILLL;
        if (z) {
            if (interfaceC1168540gVw instanceof InterfaceC1168520gVu) {
                ((InterfaceC1168520gVu) interfaceC1168540gVw).onPlaylistSelected(str, str2, z2, i);
            } else if (interfaceC1168540gVw != null) {
                interfaceC1168540gVw.onPlaylistSelected(str, str2, z2);
            }
        } else if (interfaceC1168540gVw instanceof InterfaceC1168520gVu) {
            ((InterfaceC1168520gVu) interfaceC1168540gVw).onPlaylistSelected("", "", z2, 0);
        } else if (interfaceC1168540gVw != null) {
            interfaceC1168540gVw.onPlaylistSelected("", "", z2);
        }
        setStateImmediate(new AwS0S2010000_18(str, str2, z, 1));
    }
}
