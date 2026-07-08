package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C05YD;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09R3;
import X.C0HQN;
import X.C0PEM;
import X.C0T1N;
import X.C1294160jmY;
import X.C1296720jqg;
import X.C1301790jyr;
import X.C1351210lGZ;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C2296808zG;
import X.C23250099c;
import X.C384050F3z;
import X.C435650H6l;
import X.C440930HQt;
import X.C440950HQv;
import X.C452080Ho6;
import X.C452501pT;
import X.C5183020f;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LoadingV2Cell extends PowerCell<C440930HQt> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(225));
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public FrameLayout LLILZ;
    public C1294160jmY LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LoadingV2Cell.class, "baseVM", "getBaseVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/framework/MixStudioBaseViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LoadingV2Cell.class, "resultsVM", "getResultsVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    public LoadingV2Cell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioBaseViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 460);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(155);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 447), awS573S0100000_29, AFwS218S0000000_29.get$arr$(227), new AwS573S0100000_29((C03K6) this, 437), new AwS573S0100000_29((C03K6) this, 448), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 451), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 454), null, new AwS573S0100000_29((C03K6) this, 457));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_292 = new AwS573S0100000_29((C03K6) this, 433);
            AwS573S0100000_29 awS573S0100000_293 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 435);
            AwS573S0100000_29 awS573S0100000_294 = new AwS573S0100000_29(c19719912DlLIZ, 438);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_292, 40));
            AwS573S0100000_29 awS573S0100000_295 = new AwS573S0100000_29(c01gwLIZIZ, 443);
            AwS573S0100000_29 awS573S0100000_296 = new AwS573S0100000_29(c01gwLIZIZ, 446);
            AwS573S0100000_29 awS573S0100000_297 = new AwS573S0100000_29(c01gwLIZIZ, 449);
            AwS573S0100000_29 awS573S0100000_298 = new AwS573S0100000_29(c01gwLIZIZ, 452);
            AwS573S0100000_29 awS573S0100000_299 = new AwS573S0100000_29(c01gwLIZIZ, 455);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS573S0100000_294, awS573S0100000_29, new C452080Ho6(), awS573S0100000_295, awS573S0100000_296, awS573S0100000_293, aFwS273S0000000_29, awS573S0100000_297, awS573S0100000_298, awS573S0100000_299);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 458), awS573S0100000_29, AFwS218S0000000_29.get$arr$(226), new AwS573S0100000_29((C03K6) this, 462), new AwS573S0100000_29((C03K6) this, 464), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 466), aFwS273S0000000_29, new AwS573S0100000_29((C03K6) this, 468), null, new AwS573S0100000_29((C03K6) this, 470));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ, 471), awS573S0100000_29, AFwS218S0000000_29.get$arr$(218), new AwS573S0100000_29((C03K6) this, 421), new AwS573S0100000_29((C03K6) this, 422), new AwS573S0100000_29((C03K6) this, 425), aFwS273S0000000_29, null, null, new AwS573S0100000_29((C03K6) this, 427));
        }
        this.LLILLJJLI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        AwS573S0100000_29 awS573S0100000_2910 = new AwS573S0100000_29(c19719912DlLIZ2, 429);
        AFwS273S0000000_29 aFwS273S0000000_292 = AFwS273S0000000_29.get$arr$(156);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 432), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(224), new AwS573S0100000_29((C03K6) this, 436), new AwS573S0100000_29((C03K6) this, 439), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 441), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 444), null, new AwS573S0100000_29((C03K6) this, 450));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS573S0100000_29 awS573S0100000_2911 = new AwS573S0100000_29((C03K6) this, 453);
            AwS573S0100000_29 awS573S0100000_2912 = new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 456);
            AwS573S0100000_29 awS573S0100000_2913 = new AwS573S0100000_29(c19719912DlLIZ2, 459);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS430S0200000_29((InterfaceC451590HnJ) obj, awS573S0100000_2911, 41));
            AwS573S0100000_29 awS573S0100000_2914 = new AwS573S0100000_29(c01gwLIZIZ2, 461);
            AwS573S0100000_29 awS573S0100000_2915 = new AwS573S0100000_29(c01gwLIZIZ2, 463);
            AwS573S0100000_29 awS573S0100000_2916 = new AwS573S0100000_29(c01gwLIZIZ2, 465);
            AwS573S0100000_29 awS573S0100000_2917 = new AwS573S0100000_29(c01gwLIZIZ2, 467);
            AwS573S0100000_29 awS573S0100000_2918 = new AwS573S0100000_29(c01gwLIZIZ2, 469);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS573S0100000_2913, awS573S0100000_2910, new C452080Ho6(), awS573S0100000_2914, awS573S0100000_2915, awS573S0100000_2912, aFwS273S0000000_292, awS573S0100000_2916, awS573S0100000_2917, awS573S0100000_2918);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 420), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(219), new AwS573S0100000_29((C03K6) this, 423), new AwS573S0100000_29((C03K6) this, 424), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 426), aFwS273S0000000_292, new AwS573S0100000_29((C03K6) this, 428), null, new AwS573S0100000_29((C03K6) this, 430));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS573S0100000_29(c19719912DlLIZ2, 431), awS573S0100000_2910, AFwS218S0000000_29.get$arr$(223), new AwS573S0100000_29((C03K6) this, 434), new AwS573S0100000_29((C03K6) this, 440), new AwS573S0100000_29((C03K6) this, 442), aFwS273S0000000_292, null, null, new AwS573S0100000_29((C03K6) this, 445));
        }
        this.LLILLL = assemVMLazy2;
        this.LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(221));
        this.LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(220));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(222));
    }

    public final MixStudioResultsPageViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (MixStudioResultsPageViewModel) assemVMLazy.getValue();
    }

    public final MixStudioStatusRepository L5() {
        return (MixStudioStatusRepository) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AssemViewModel.selectSubscribe$default(I5(), C0HQN.LL, null, null, null, new AwS581S0100000_2((Function1) new AwS608S0100000_29(this, 275), (Function1<Object, String>) 572), 14, null);
    }

    public static Object R5(C1301790jyr c1301790jyr) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1301790jyr));
        c2252611DEt.LJIJJ();
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_social_user_relation_res";
        requestParams.bundle = "imagine_studio/alpha_player_loading_582k/output.mp4";
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new C5183020f(c2252611DEt, 293));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1301790jyr);
        }
        return objLJIJ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, C435650H6l.LIZ(-1, -1, 0, 0, 0, 252));
        C1294160jmY c1294160jmY = new C1294160jmY(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((Number) this.LLILZLL.getValue()).intValue(), ((Number) this.LLILZLL.getValue()).intValue(), 17);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1294160jmY);
        c1294160jmY.setLayoutParams(layoutParams);
        this.LLILZIL = c1294160jmY;
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout2, new FrameLayout.LayoutParams(((Number) this.LLIZ.getValue()).intValue(), ((Number) this.LLIZ.getValue()).intValue(), 17));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        frameLayout2.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLIZLLLIL.getValue()).intValue());
        layoutParams2.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams2);
        tuxIconView.setIconRes(R.raw.icon_plus_fill);
        tuxIconView.setTintColorRes(R.attr.a1j);
        frameLayout2.addView(tuxIconView);
        C786410Ut5.O7(frameLayout2, new ACListenerS141S0100000_6(this, 74));
        this.LLILZ = frameLayout2;
        frameLayout.addView(this.LLILZIL);
        frameLayout.addView(this.LLILZ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1296720jqg(this, viewGroup, null), 3);
        return frameLayout;
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        MixStudioStatusRepository mixStudioStatusRepositoryL5;
        C05YD<Boolean> c05ydLJIIJ;
        if (!I5().getState().LLILLJJLI && (mixStudioStatusRepositoryL5 = L5()) != null && (c05ydLJIIJ = mixStudioStatusRepositoryL5.LJIIJ()) != null && c05ydLJIIJ.getValue().booleanValue()) {
            new C1351210lGZ(this.itemView.getContext()).LIZ();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C440950HQv(this, null), 3);
        }
    }

    public final Object N5(Context context, C1301790jyr c1301790jyr) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1301790jyr));
        c2252611DEt.LJIJJ();
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_social_user_relation_res";
        requestParams.bundle = "imagine_studio/alpha_player_loading_582k/config.json";
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new AwS375S0200000_9(this, context, c2252611DEt, 166));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1301790jyr);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:23:0x0051, B:24:0x0054, B:26:0x005f, B:19:0x0040, B:20:0x0043, B:16:0x0037), top: B:32:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P5(android.content.Context r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1301790jyr
            if (r0 == 0) goto L26
            r3 = r9
            X.0jyr r3 = (X.C1301790jyr) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r6 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 0
            r1 = 2
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L40
            if (r0 != r1) goto L2c
            com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.AlphaPlayerVideoFileModel r0 = r3.LL
            goto L51
        L26:
            X.0jyr r3 = new X.0jyr
            r3.<init>(r7, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r6)
            r3.LLILZ = r4     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = r7.N5(r8, r3)     // Catch: java.lang.Exception -> L99
            if (r6 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L99
        L43:
            r0 = r6
            com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.AlphaPlayerVideoFileModel r0 = (com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.AlphaPlayerVideoFileModel) r0     // Catch: java.lang.Exception -> L99
            r3.LL = r0     // Catch: java.lang.Exception -> L99
            r3.LLILZ = r1     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = R5(r3)     // Catch: java.lang.Exception -> L99
            if (r6 != r2) goto L54
            return r2
        L51:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L99
        L54:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource r3 = new com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource     // Catch: java.lang.Exception -> L99
            r3.<init>()     // Catch: java.lang.Exception -> L99
            com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.AlphaPlayerVideoFileModel$Item r2 = r0.portrait     // Catch: java.lang.Exception -> L99
            if (r2 == 0) goto L98
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$DataInfo r1 = new com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource$DataInfo     // Catch: java.lang.Exception -> L99
            r1.<init>(r6)     // Catch: java.lang.Exception -> L99
            int r0 = r2.align     // Catch: java.lang.Exception -> L99
            r1.setScaleType(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.version     // Catch: java.lang.Exception -> L99
            r1.setVersion(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.totalFrame     // Catch: java.lang.Exception -> L99
            r1.setTotalFrame(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.videoWidth     // Catch: java.lang.Exception -> L99
            r1.setVideoWidth(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.videoHeight     // Catch: java.lang.Exception -> L99
            r1.setVideoHeight(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.actualWidth     // Catch: java.lang.Exception -> L99
            r1.setActualWidth(r0)     // Catch: java.lang.Exception -> L99
            int r0 = r2.actualHeight     // Catch: java.lang.Exception -> L99
            r1.setActualHeight(r0)     // Catch: java.lang.Exception -> L99
            int[] r0 = r2.alphaFrame     // Catch: java.lang.Exception -> L99
            r1.setAlphaArea(r0)     // Catch: java.lang.Exception -> L99
            int[] r0 = r2.rgbFrame     // Catch: java.lang.Exception -> L99
            r1.setRgbArea(r0)     // Catch: java.lang.Exception -> L99
            r3.setPortraitDataInfo(r1)     // Catch: java.lang.Exception -> L99
            r3.setLoop(r4)     // Catch: java.lang.Exception -> L99
            return r3
        L98:
            return r5
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell.P5(android.content.Context, X.05Vn):java.lang.Object");
    }
}
