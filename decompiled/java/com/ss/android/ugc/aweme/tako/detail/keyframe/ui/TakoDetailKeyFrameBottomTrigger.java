package com.ss.android.ugc.aweme.tako.detail.keyframe.ui;

import X.C03H5;
import X.C0QSJ;
import X.C10IT;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C337180DJs;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC20234914Fn;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoDetailKeyFrameBottomTrigger extends BaseCellTriggerComponent<TakoDetailKeyFrameBottomTrigger> implements InterfaceC20234914Fn, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final TakoDetailKeyFrameBottomTrigger LLJJLIIIJLLLLLLLZ = this;
    public Map<String, ? extends List<TakoKeyFramePoint>> LLJL = C2097608Jq.LJ();
    public TakoInnerDetailVM LLJLIL;
    public InterfaceC20234914Fn LLJLILLLLZIIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC20234914Fn.class) {
            this.LLJLILLLLZIIL = (InterfaceC20234914Fn) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoDetailKeyFrameBottomTriggerVScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC20234914Fn.class) {
            return this.LLJLILLLLZIIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoDetailKeyFrameBottomTriggerVScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoDetailKeyFrameBottomTriggerVScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(TakoDetailKeyFrameBottomAssemAssem.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC20234914Fn.class) {
            this.LLJLILLLLZIIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20234914Fn
    public final boolean LLLLIIL(String str) {
        if (this.LLJL.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20234914Fn
    public final List<TakoKeyFramePoint> LLLLLZ(String str) {
        return this.LLJL.get(str);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoDetailKeyFrameBottomTriggerVScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC20234914Fn.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
            this.LLJLIL = (TakoInnerDetailVM) new AssemVMLazy(C724750Sbp.LJIIJ(c19egLIZ, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 896), new C452070Ho5(), C724750Sbp.LJII(c19egLIZ), C724750Sbp.LJIIIZ(c19egLIZ), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) c19egLIZ, 897), AFwS241S0000000_10.get$arr$(379)).getValue();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{TakoDetailKeyFrameBottomTriggerVScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC20234914Fn.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        C337180DJs.LIZ(LJJIJL());
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null && this.LLJL.get(aid) != null && (interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS411S0200000_10(videoItemParams, this, 53));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        String aid;
        Map<String, ? extends List<TakoKeyFramePoint>> map;
        Aweme aweme = videoItemParams.getAweme();
        List<TakoKeyFramePoint> list = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aid == null || videoItemParams.getAweme().isAd() || C10IT.LJIIJJI(videoItemParams.getAweme())) {
            return false;
        }
        TakoInnerDetailVM takoInnerDetailVM = this.LLJLIL;
        if (takoInnerDetailVM != null && (map = takoInnerDetailVM.LLILLJJLI) != null) {
            list = map.get(aid);
        }
        Map<String, ? extends List<TakoKeyFramePoint>> mapLIZJ = C2097908Jt.LIZJ(new Pair(aid, list));
        this.LLJL = mapLIZJ;
        if (mapLIZJ.get(aid) == null) {
            return false;
        }
        return true;
    }
}
