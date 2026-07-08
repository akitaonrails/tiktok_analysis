package com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C1250210idf;
import X.C13LE;
import X.C1558520qew;
import X.C1674830tgX;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.story.highlights.feed.OtherProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.profile.business.story.data.StoryHighlightsProfileData;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.base.IHeaderStoryHighlightsAbility;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class HeaderStoryHighlightsOtherCollectionComponent extends BaseUIComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final AssemVMLazy LLJJL;
    public final C736950SvV LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C1674830tgX LLJLIL;
    public final Set<String> LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderStoryHighlightsOtherCollectionComponent.class, "highlightsOtherVM", "getHighlightsOtherVM()Lcom/ss/android/ugc/profile/business/story/highlights/StoryHighlightsOtherProfileVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        IHeaderStoryHighlightsAbility iHeaderStoryHighlightsAbility;
        View view = this.LLJJ;
        if (view == null || (iHeaderStoryHighlightsAbility = (IHeaderStoryHighlightsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderStoryHighlightsAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderStoryHighlightsAbility.LJIIIZ(this.LLJILLL, view, str);
    }

    public final void up() {
        LinearLayoutManager linearLayoutManager;
        C1674830tgX c1674830tgX = this.LLJLIL;
        if (c1674830tgX == null) {
            return;
        }
        RecyclerView recyclerView = this.LLJL;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = c1674830tgX.getItemCount();
        int i = 0;
        while (iFindFirstVisibleItemPosition < itemCount && ((i < 5 || !arrayList.isEmpty()) && arrayList.size() < 5)) {
            StoryHighlightCollection storyHighlightCollectionLLLFZ = c1674830tgX.LLLFZ(iFindFirstVisibleItemPosition);
            if (storyHighlightCollectionLLLFZ != null) {
                i++;
                if (!zp().getState().LLILLJJLI.containsKey(storyHighlightCollectionLLLFZ.collectionId)) {
                    arrayList.add(storyHighlightCollectionLLLFZ.collectionId);
                }
            }
            iFindFirstVisibleItemPosition++;
        }
        zp().setState(new AwS581S0100000_2((List) arrayList, (List<ActionBarButtonConfBusiness>) 486));
    }

    public final StoryHighlightsOtherProfileVM zp() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (StoryHighlightsOtherProfileVM) assemVMLazy.getValue();
    }

    public HeaderStoryHighlightsOtherCollectionComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryHighlightsOtherProfileVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 896);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(544);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((AbstractC738140SxQ) this, 897), aFwS229S0000000_2, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJL = assemVMLazy;
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(746);
        this.LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(OtherProfileStoryHighlightsFeedSharedVM.class), aFwS187S0000000_2, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS229S0000000_2.get$arr$(545), new AwS546S0100000_2((AbstractC738140SxQ) this, 898), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLILLLLZIIL = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String yp() {
        /*
            r4 = this;
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility> r0 = com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility.class
            r3 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility r0 = (com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility) r0
            if (r0 == 0) goto L13
            X.0igu r3 = r0.getOtherParams()
        L13:
            java.lang.String r2 = ""
            if (r3 == 0) goto L46
            java.lang.String r1 = r3.LJIJJ
            if (r1 == 0) goto L42
            int r0 = r1.length()
            if (r0 <= 0) goto L42
        L21:
            java.lang.String r0 = r3.LJIJ
            if (r0 == 0) goto L26
            r2 = r0
        L26:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L39
            java.lang.String r0 = "slide_left"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L39
            java.lang.String r1 = "fyp_slide"
        L38:
            return r1
        L39:
            int r0 = r1.length()
            if (r0 != 0) goto L38
            java.lang.String r1 = "other"
            return r1
        L42:
            java.lang.String r1 = r3.LJIIJ
            if (r1 != 0) goto L47
        L46:
            r1 = r2
        L47:
            if (r3 == 0) goto L26
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent.yp():java.lang.String");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        super.Hj(profileComponents);
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig r9) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent.So(com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig):android.view.View");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        try {
            StoryHighlightsProfileData storyHighlightsProfileData = (StoryHighlightsProfileData) C1250210idf.LIZ(nVar.toString(), StoryHighlightsProfileData.class);
            if (storyHighlightsProfileData != null) {
                List<StoryHighlightCollection> highlightCollections = storyHighlightsProfileData.getHighlightCollections();
                if (highlightCollections != null) {
                    zp().setState(new AwS581S0100000_2((List) highlightCollections, (List<ActionBarButtonConfBusiness>) 487));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, zp(), new C2217381BqS() { // from class: X.05p1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C05N8) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 139), 6);
        C736680Sv4.LJIIIZ(this, zp(), new C2217381BqS() { // from class: X.05nH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C05N8) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.05nJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C05N8) obj).LLILZ;
            }
        }, null, new AwS651S0100000_2(this, 7), 12);
    }
}
