package com.ss.android.ugc.aweme.search.detail.comment.ui;

import X.C01GW;
import X.C03H5;
import X.C0HHT;
import X.C0QSJ;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1830607Ey;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448280Hhy;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.comment.ability.SearchDetailCommentScope;
import com.ss.android.ugc.aweme.search.detail.comment.viewmodel.SearchDetailCommentVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoDetailCommentTrigger extends BaseCellTriggerComponent<SearchVideoDetailCommentTrigger> implements InterfaceC448280Hhy, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final SearchVideoDetailCommentTrigger LLJLIL;
    public Comment LLJLILLLLZIIL;
    public InterfaceC448280Hhy LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchVideoDetailCommentTrigger.class, "searchDetailCommentVM", "getSearchDetailCommentVM()Lcom/ss/android/ugc/aweme/search/detail/comment/viewmodel/SearchDetailCommentVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchVideoDetailCommentTrigger() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchDetailCommentVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 295), null, AFwS241S0000000_10.get$arr$(175));
        this.LLJL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(179));
        this.LLJLIL = this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC448280Hhy.class) {
            this.LLJLL = (InterfaceC448280Hhy) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchDetailCommentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC448280Hhy.class) {
            return this.LLJLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailCommentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailCommentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC448280Hhy.class) {
            this.LLJLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(((Number) C1830607Ey.LIZ.getValue()).intValue() == 1 ? SearchVideoDetailBubbleCommentAssem.class : SearchVideoDetailDescriptionCommentAssem.class);
    }

    @Override // X.InterfaceC448280Hhy
    public final boolean pn() {
        return this.LLJLILLLLZIIL != null;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailCommentScope.class}).unbindAbility(this.LLJLIL, InterfaceC448280Hhy.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchDetailCommentScope.class}).bindAbility(this.LLJLIL, InterfaceC448280Hhy.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[0]);
        Comment comment = this.LLJLILLLLZIIL;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            str = baseFeedPageParams.cid;
        } else {
            str = null;
        }
        assemViewModel.getClass();
        assemViewModel.setState(new AwS120S1100000_6(comment, str, 0));
        C337180DJs.LIZ(LJJIJL());
        if (this.LLJLILLLLZIIL != null && (interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS554S0100000_10(this, 294));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020d A[PHI: r0
      0x020d: PHI (r0v232 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v231 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v244 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:92:0x01e4, B:99:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0289 A[PHI: r0
      0x0289: PHI (r0v59 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v58 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v111 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:116:0x0260, B:123:0x0287] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0332 A[PHI: r0
      0x0332: PHI (r0v70 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v69 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v96 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:131:0x02c1, B:138:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039d A[PHI: r0
      0x039d: PHI (r0v127 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v126 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v207 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:167:0x0374, B:174:0x039b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0440 A[PHI: r0
      0x0440: PHI (r0v138 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v137 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v192 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:182:0x03d5, B:189:0x03fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b4 A[PHI: r0
      0x04b4: PHI (r0v161 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v160 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v173 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:220:0x048b, B:227:0x04b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[PHI: r0
      0x00ff: PHI (r0v34 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v33 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v278 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:42:0x00d6, B:49:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[PHI: r0
      0x01a2: PHI (r0v45 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v44 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v263 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:57:0x0137, B:64:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.comment.ui.SearchVideoDetailCommentTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }
}
