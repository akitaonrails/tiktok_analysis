package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C01GW;
import X.C03H5;
import X.C0Q3E;
import X.C0QSJ;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C2097608Jq;
import X.C337180DJs;
import X.C436190H8n;
import X.C452501pT;
import X.C655450PnL;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC20636315p3;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailKeyFrameBottomTrigger extends BaseCellTriggerComponent<SearchDetailKeyFrameBottomTrigger> implements InterfaceC20636315p3, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final SearchDetailKeyFrameBottomTrigger LLJJLIIIJLLLLLLLZ = this;
    public Map<String, ? extends List<SearchKeyFramePoint>> LLJL = C2097608Jq.LJ();
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(180));
    public InterfaceC20636315p3 LLJLILLLLZIIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC20636315p3.class) {
            this.LLJLILLLLZIIL = (InterfaceC20636315p3) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchDetailKeyFrameBottomTriggerVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC20636315p3.class) {
            return this.LLJLILLLLZIIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailKeyFrameBottomTriggerVScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailKeyFrameBottomTriggerVScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(SearchDetailKeyFrameBottomAssemAssem.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC20636315p3.class) {
            this.LLJLILLLLZIIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20636315p3
    public final boolean LLLLIIL(String str) {
        if (this.LLJL.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20636315p3
    public final List<SearchKeyFramePoint> LLLLLZ(String str) {
        return this.LLJL.get(str);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailKeyFrameBottomTriggerVScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC20636315p3.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailKeyFrameBottomTriggerVScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC20636315p3.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        int i;
        tp(videoItemParams);
        C337180DJs.LIZ(LJJIJL());
        String strLIZ = C436190H8n.LIZ(videoItemParams.getAweme());
        if (strLIZ != null && this.LLJL.get(strLIZ) != null) {
            List<SearchKeyFramePoint> list = this.LLJL.get(strLIZ);
            if (list != null) {
                SearchKeyFramePoint searchKeyFramePoint = (SearchKeyFramePoint) C13LP.LJJJLL(list);
                if (searchKeyFramePoint == null || !searchKeyFramePoint.fromKeySegmentInfo || searchKeyFramePoint == null || (searchKeyFramePoint.title.length() > 0 && (i = searchKeyFramePoint.secondStart) >= 0 && searchKeyFramePoint.secondEnd > i)) {
                    if (list != null && !list.isEmpty()) {
                        C0Q3E.LIZJ(videoItemParams.getAweme()).Y30().LIZ(new C655450PnL(list));
                    }
                } else {
                    return;
                }
            }
            InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null);
            if (interactAreaAttachAbility != null) {
                interactAreaAttachAbility.Fn1(this, new AwS411S0200000_10(videoItemParams, this, 26));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0270 A[PHI: r0
      0x0270: PHI (r0v70 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v69 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v91 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:112:0x0247, B:119:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[PHI: r0
      0x0119: PHI (r0v18 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v17 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v114 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:45:0x00f0, B:52:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8 A[PHI: r0
      0x01c8: PHI (r0v33 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v32 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v54 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:79:0x019f, B:86:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r18) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyFrameBottomTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }
}
