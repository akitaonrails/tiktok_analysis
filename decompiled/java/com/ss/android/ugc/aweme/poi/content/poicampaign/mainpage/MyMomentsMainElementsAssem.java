package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage;

import X.AnonymousClass0956;
import X.C01D1;
import X.C01GW;
import X.C036E;
import X.C1179570gnj;
import X.C1180060goW;
import X.C1180490gpD;
import X.C1180600gpO;
import X.C1180880gpq;
import X.C1188470h25;
import X.C1189360h3W;
import X.C1198060hHY;
import X.C1198230hHp;
import X.C1198240hHq;
import X.C1198280hHu;
import X.C1198350hI1;
import X.C1209080hZK;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1365870leD;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C13BV;
import X.C13LE;
import X.C1445970njP;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1599690rjL;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C20145713s7;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C622680Oba;
import X.C654910PmT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737030Svd;
import X.C7829033z;
import X.C786410Ut5;
import X.C824110WUn;
import X.C838130WuJ;
import X.C844470XAv;
import X.EnumC1991007r2;
import X.InterfaceC2217461Bqa;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.content.poicampaign.CampaignInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.FeaturedVideoInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.HashtagInfo;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.IPoiCampaignMapAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import irm.AkS6S1200000_18;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS136S0110000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsMainElementsAssem extends UIContentAssem {
    public static final C824110WUn LLLLLLLZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLZ;
    public static Bitmap LLLLLLZZ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1180490gpD.class, "PoiCampaignHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public ScrollView LLJILJIL;
    public C1179570gnj LLJILJILJ;
    public SmartImageView LLJILLL;
    public SmartImageView LLJJ;
    public SmartImageView LLJJI;
    public SmartImageView LLJJIII;
    public FrameLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public SmartImageView LLJJJJLIIL;
    public SmartImageView LLJJL;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public SmartImageView LLLFFI;
    public SmartImageView LLLFZ;
    public ConstraintLayout LLLI;
    public TuxTextView LLLII;
    public TuxTextView LLLIIII;
    public SmartImageView LLLIIIIL;
    public SmartImageView LLLIIIL;
    public View LLLIIL;
    public View LLLIILIL;
    public TuxTextView LLLIL;
    public ImageView LLLILZ;
    public TuxTextView LLLILZJ;
    public C1390410mHn LLLILZLLLI;
    public ConstraintLayout LLLIZZ;
    public SmartImageView LLLJ;
    public SmartImageView LLLJIL;
    public SmartImageView LLLJL;
    public SmartImageView LLLL;
    public ConstraintLayout LLLLII;
    public View LLLLIIIILLL;
    public View LLLLIIL;
    public View LLLLIILL;
    public View LLLLIILLL;
    public View LLLLIL;
    public TuxTextView LLLLILI;
    public ConstraintLayout LLLLJ;
    public View LLLLJI;
    public TuxTextView LLLLL;
    public TuxTextView LLLLLIL;
    public View LLLLLILLIL;
    public TuxTextView LLLLLJIL;
    public TuxTextView LLLLLJLJLL;
    public FrameLayout LLLLLL;
    public View LLLLLLIL;
    public AnimatorSet LLLLLLJ;
    public ObjectAnimator LLLLLLL;
    public View LLLLLLLLL;
    public final C01GW LLLLLLLLLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0WUn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MyMomentsMainElementsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/content/poicampaign/mainpage/MyMomentsSharedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLLLZIL = new Object() { // from class: X.0WUn
        };
    }

    public MyMomentsMainElementsAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MyMomentsSharedViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 967), AFwS256S0000000_18.get$arr$(312), null, true);
        this.LLLLLLLLLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(295));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1180490gpD Jo() {
        return (C1180490gpD) this.LLIZLLLIL.getValue();
    }

    public final MyMomentsSharedViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLLZ;
        return (MyMomentsSharedViewModel) assemVMLazy.getValue();
    }

    public final void Zo() {
        ScrollView scrollView = this.LLJILJIL;
        if (scrollView != null) {
            scrollView.setOnTouchListener(null);
            scrollView.setClickable(true);
            scrollView.setEnabled(true);
            scrollView.setDescendantFocusability(262144);
        }
        C1179570gnj c1179570gnj = this.LLJILJILJ;
        if (c1179570gnj != null) {
            c1179570gnj.setOnTouchListener(null);
            c1179570gnj.LLILZ = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        AnimatorSet animatorSet = this.LLLLLLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLLLLJ = null;
        ObjectAnimator objectAnimator = this.LLLLLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LLLLLLL = null;
        ImageView imageView = this.LLLILZ;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, 0.0f);
        }
        LLLLLLZZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        Vo(false);
        Zo();
        C339190DRl.LIZIZ(this.LLLIZZ);
    }

    public final void So(boolean z) {
        IPoiCampaignMapAbility iPoiCampaignMapAbility;
        AwS136S0110000_18 awS136S0110000_18 = new AwS136S0110000_18(this, z, 1);
        if (z) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (iPoiCampaignMapAbility = (IPoiCampaignMapAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiCampaignMapAbility.class, null)) != null) {
                iPoiCampaignMapAbility.zn0(new AwS597S0100000_18(awS136S0110000_18, 275));
                return;
            }
            return;
        }
        awS136S0110000_18.invoke();
    }

    public final void Vo(boolean z) {
        for (View view : C1697810uHb.LJIIJJI(this.LLJJJ, this.LLJJIJIL, this.LLJJIJI, this.LLJJJIL, this.LLLIILIL, this.LLLLIIL, this.LLLLIILL, this.LLLLIILLL, this.LLLLIL, this.LLLL, this.LLJIJIL, this.LLJI)) {
            if (z) {
                if (view != null) {
                    view.setEnabled(false);
                }
            } else if (view != null) {
                view.setEnabled(true);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDownloadComplete(C7829033z c7829033z) {
        Lifecycle.State currentState;
        MyMomentsData myMomentsData;
        HashtagInfo hashtagInfo;
        Lifecycle lifecycle;
        if (C123100dR.LIZ(c7829033z.LIZ)) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            Long l = null;
            if (fragmentLJI != null && (lifecycle = fragmentLJI.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            } else {
                currentState = null;
            }
            if (currentState == Lifecycle.State.RESUMED) {
                C1198230hHp c1198230hHpLIZ = Lo().getState().LL.LIZ();
                if (c1198230hHpLIZ != null && (myMomentsData = c1198230hHpLIZ.LIZIZ) != null && (hashtagInfo = myMomentsData.hashtagInfo) != null) {
                    l = hashtagInfo.hashtagId;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://openVideoEdit");
                smartRouteBuildRoute.withParam("media_path", c7829033z.LIZ);
                smartRouteBuildRoute.withParam("shoot_way", "my_year_campaign_highlights");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[\"");
                sbLIZ.append(l);
                sbLIZ.append("\"]");
                smartRouteBuildRoute.withParam("challenge_id", C2188811AlT.LIZIZ(sbLIZ));
                smartRouteBuildRoute.withParam("landing_back", true);
                smartRouteBuildRoute.open();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDownloadFailed(C1198240hHq c1198240hHq) {
        View view;
        C339190DRl.LIZIZ(this.LLLILZ);
        C339190DRl.LIZLLL(this.LLLIL);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131823044);
            c1389890mGx.LJIIJJI();
        }
        Context context = getContext();
        if (context != null && (view = this.LLLIILIL) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#FFFF4C16"));
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(49));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(49));
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(49));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(49));
            view.setBackground(c384050F3z.LIZ(context));
        }
        C339190DRl.LIZIZ(this.LLLIZZ);
        Zo();
        Vo(false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInvitationAccomplished(C1445970njP c1445970njP) {
        Aweme aweme;
        String str;
        if (c1445970njP.LIZ == 10) {
            Object obj = c1445970njP.LIZJ;
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            PoiAnchorExtra poiAnchorExtraLIZ = C1188470h25.LIZ(aweme);
            if (poiAnchorExtraLIZ != null) {
                str = poiAnchorExtraLIZ.poiId;
            } else {
                str = null;
            }
            if (aweme != null) {
                MyMomentsSharedViewModel myMomentsSharedViewModelLo = Lo();
                String str2 = Jo().LL.LJFF;
                if (str2 == null) {
                    str2 = "";
                }
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                if (str == null) {
                    str = "-1";
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myMomentsSharedViewModelLo), null, null, new C1198280hHu(str2, aid, str, myMomentsSharedViewModelLo, null), 3);
            }
        }
    }

    @C14EU
    public final void onPoiRetagAccomplished(C1198060hHY c1198060hHY) {
        if (c1198060hHY.LIZ == EnumC1991007r2.ADD_POI_ACCOMPLISHED_EVENT) {
            C339190DRl.LIZIZ(this.LLJJI);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPostCompleted(C737030Svd c737030Svd) {
        C19EG c19egLIZ;
        if (c737030Svd.LIZ == 15 && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131823056);
            c1389890mGx.LJIIJJI();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSharedCompleted(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "ttls_annual_event_user_track")) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), this.LLJILJIL, c1365870leD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x063a A[Catch: Exception -> 0x0691, TryCatch #1 {Exception -> 0x0691, blocks: (B:116:0x0618, B:118:0x062c, B:120:0x0630, B:122:0x0634, B:123:0x0636, B:125:0x063a, B:126:0x063c, B:128:0x0642, B:137:0x0653, B:139:0x065f), top: B:244:0x0618 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0642 A[Catch: Exception -> 0x0691, TryCatch #1 {Exception -> 0x0691, blocks: (B:116:0x0618, B:118:0x062c, B:120:0x0630, B:122:0x0634, B:123:0x0636, B:125:0x063a, B:126:0x063c, B:128:0x0642, B:137:0x0653, B:139:0x065f), top: B:244:0x0618 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x065f A[Catch: Exception -> 0x0691, TRY_LEAVE, TryCatch #1 {Exception -> 0x0691, blocks: (B:116:0x0618, B:118:0x062c, B:120:0x0630, B:122:0x0634, B:123:0x0636, B:125:0x063a, B:126:0x063c, B:128:0x0642, B:137:0x0653, B:139:0x065f), top: B:244:0x0618 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28) {
        /*
            Method dump skipped, instruction units count: 2475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem.onViewCreated(android.view.View):void");
    }

    public static void ap(Context context, String str) {
        try {
            C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(context, "clipboard"), ClipData.newPlainText("HashtagText", str), CertProviderManagerKt.findCert("bpea-poi_annual_campaign_activity", 1476399158));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void Go(MyMomentsData myMomentsData, Context context) {
        Integer num;
        MyMomentsData myMomentsData2;
        List list;
        SmartImageView smartImageView;
        TuxTextView tuxTextView;
        SmartImageView smartImageView2;
        TuxTextView tuxTextView2;
        UrlModel cover;
        FeaturedVideoInfo featuredVideoInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        FeaturedVideoInfo featuredVideoInfo2;
        TuxTextView tuxTextView3 = this.LLLILZJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(23);
            if (myMomentsData != null && (featuredVideoInfo2 = myMomentsData.featuredVideoInfo) != null) {
                str5 = featuredVideoInfo2.indicatorTitle;
            } else {
                str5 = null;
            }
            tuxTextView3.setText(str5);
            tuxTextView3.setTextColor(C1180060goW.LJII("#FFF9D9"));
        }
        View view = this.LLLLIIIILLL;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#FFFFF7E7"));
            c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(12));
            view.setBackground(c384050F3z.LIZ(context));
        }
        if (myMomentsData != null) {
            FeaturedVideoInfo featuredVideoInfo3 = myMomentsData.featuredVideoInfo;
            if (featuredVideoInfo3 != null && (str4 = featuredVideoInfo3.decorationImg) != null) {
                C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("add_poi_campaign", "highlights_img", null).LIZIZ(str4);
                c1189360h3WLIZIZ.LIZ.LJJIJL(context);
                c1189360h3WLIZIZ.LIZLLL(this.LLLIIIIL);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C654910PmT.LIZ(12.0f, context);
                c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
                c1189360h3WLIZIZ.LIZIZ();
            }
            FeaturedVideoInfo featuredVideoInfo4 = myMomentsData.featuredVideoInfo;
            if (featuredVideoInfo4 != null && (str3 = featuredVideoInfo4.decorationImg) != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
                c1331670kl3LJIIIZ.LJJIJL(context);
                c1331670kl3LJIIIZ.LJJ(this.LLLJL);
                C1331750klB c1331750klB2 = new C1331750klB();
                c1331750klB2.LJ = C654910PmT.LIZ(12.0f, context);
                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB2);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
            FeaturedVideoInfo featuredVideoInfo5 = myMomentsData.featuredVideoInfo;
            if (featuredVideoInfo5 != null && (str2 = featuredVideoInfo5.decorationImg) != null) {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ2.LJJIJL(context);
                c1331670kl3LJIIIZ2.LJJ(this.LLJJIII);
                C1331750klB c1331750klB3 = new C1331750klB();
                c1331750klB3.LJ = C654910PmT.LIZ(12.0f, context);
                c1331670kl3LJIIIZ2.LJJI = new C1331730kl9(c1331750klB3);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
            CampaignInfo campaignInfo = myMomentsData.campaignInfo;
            if (campaignInfo != null && (str = campaignInfo.starImage) != null) {
                C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ3.LJJIJL(context);
                c1331670kl3LJIIIZ3.LJJ(this.LLLJ);
                C786410Ut5.h3(c1331670kl3LJIIIZ3);
                C1331670kl3 c1331670kl3LJIIIZ4 = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ4.LJJIJL(context);
                c1331670kl3LJIIIZ4.LJJ(this.LLLJIL);
                C786410Ut5.h3(c1331670kl3LJIIIZ4);
            }
        }
        View view2 = this.LLLLIIIILLL;
        if (view2 != null) {
            C2211631BhB.LIZJ(view2, new C1209080hZK(this, myMomentsData, 2));
        }
        if (myMomentsData != null) {
            num = myMomentsData.userType;
        } else {
            num = null;
        }
        C1198230hHp c1198230hHpLIZ = Lo().getState().LL.LIZ();
        if (c1198230hHpLIZ != null) {
            myMomentsData2 = c1198230hHpLIZ.LIZIZ;
        } else {
            myMomentsData2 = null;
        }
        int i = 0;
        List<Pair> listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(this.LLLLIIL, 0), new Pair(this.LLLLIILL, 1), new Pair(this.LLLLIILLL, 2), new Pair(this.LLLLIL, 3));
        if (myMomentsData2 == null || (featuredVideoInfo = myMomentsData2.featuredVideoInfo) == null || (list = featuredVideoInfo.awemeModelList) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.size() != 4) {
            for (Pair pair : listLJIIJJI) {
                View view3 = (View) pair.getFirst();
                ((Number) pair.getSecond()).intValue();
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }
            C339190DRl.LIZIZ(this.LLLLII);
            C339190DRl.LIZIZ(this.LLLILZJ);
            C339190DRl.LIZIZ(this.LLLJL);
            C339190DRl.LIZIZ(this.LLLLIIIILLL);
            C339190DRl.LIZIZ(this.LLLJ);
            C339190DRl.LIZIZ(this.LLLJIL);
            return;
        }
        for (Pair pair2 : listLJIIJJI) {
            View view4 = (View) pair2.getFirst();
            int iIntValue = ((Number) pair2.getSecond()).intValue();
            if (iIntValue < list.size()) {
                Aweme aweme = (Aweme) ListProtector.get(list, iIntValue);
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(i, view4);
                    smartImageView = (SmartImageView) view4.findViewById(R.id.de6);
                    tuxTextView = (TuxTextView) view4.findViewById(R.id.dg9);
                    smartImageView2 = (SmartImageView) view4.findViewById(R.id.de5);
                    tuxTextView2 = (TuxTextView) view4.findViewById(R.id.dg_);
                } else {
                    smartImageView = null;
                    tuxTextView = null;
                    smartImageView2 = null;
                    tuxTextView2 = null;
                }
                C1180600gpO c1180600gpO = new C1180600gpO("add_poi_campaign", "featurevideo_img", null);
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                } else {
                    cover = null;
                }
                C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(cover));
                c1189360h3WLIZ.LIZ.LJJIJL(getContext());
                c1189360h3WLIZ.LIZLLL(smartImageView);
                C1331750klB c1331750klB4 = new C1331750klB();
                c1331750klB4.LJ = C654910PmT.LIZ(8.0f, getContext());
                c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB4);
                c1189360h3WLIZ.LIZIZ();
                String desc = aweme.getDesc();
                if (desc != null && tuxTextView != null) {
                    tuxTextView.setText(desc);
                    tuxTextView.setTuxFont(61);
                }
                User author = aweme.getAuthor();
                if (author != null) {
                    C1189360h3W c1189360h3WLIZ2 = new C1180600gpO("add_poi_campaign", "featurevideo_avatar", null).LIZ(C438710HIf.LIZ(author.getAvatarThumb()));
                    c1189360h3WLIZ2.LIZ.LJJIJL(getContext());
                    c1189360h3WLIZ2.LIZLLL(smartImageView2);
                    C1331750klB c1331750klB5 = new C1331750klB();
                    c1331750klB5.LIZ = true;
                    c1189360h3WLIZ2.LIZ.LJJI = new C1331730kl9(c1331750klB5);
                    c1189360h3WLIZ2.LIZIZ();
                    String nickname = author.getNickname();
                    if (nickname != null && tuxTextView2 != null) {
                        tuxTextView2.setText(nickname);
                        tuxTextView2.setTuxFont(61);
                    }
                }
                if (view4 != null) {
                    C786410Ut5.I7(new AkS28S0300000_18(num, this, aweme, 15), view4);
                }
            } else if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            i = 0;
        }
    }

    public final void No(MyMomentsData myMomentsData, String str) {
        Integer num;
        C1180880gpq c1180880gpq = C1180880gpq.LIZ;
        String str2 = Jo().LL.LIZ;
        if (myMomentsData != null) {
            num = myMomentsData.userType;
        } else {
            num = null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c1180880gpq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C1180880gpq.LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        C1180880gpq.LJ(fragmentLJI, "ttls_my_year_campaign_highlights_generated", c2344009Gk.LIZ);
        C339190DRl.LIZLLL(this.LLLLJ);
        Vo(true);
        ScrollView scrollView = this.LLJILJIL;
        if (scrollView != null) {
            scrollView.setClickable(false);
            scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GlU
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                        if (numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
                            if (numValueOf.intValue() == 1) {
                                view.performClick();
                            } else {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
        C1179570gnj c1179570gnj = this.LLJILJILJ;
        if (c1179570gnj != null) {
            c1179570gnj.setClickable(false);
            c1179570gnj.LLILZ = true;
            c1179570gnj.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GlV
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                        if (numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
                            if (numValueOf.intValue() == 1) {
                                view.performClick();
                            } else {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
        C339190DRl.LIZLLL(this.LLLLLLLLL);
        View view = this.LLLLLILLIL;
        if (view != null) {
            C786410Ut5.I7(new AkS6S1200000_18(this, str, myMomentsData, 3), view);
        }
    }

    public final void Ho(boolean z, Boolean bool, MyMomentsData myMomentsData, Context context) {
        Integer num;
        View view;
        HashtagInfo hashtagInfo;
        String str;
        String str2;
        MyMomentsData myMomentsData2;
        HashtagInfo hashtagInfo2;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!z) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        String string = context.getString(2131823059);
                        C1198230hHp c1198230hHpLIZ = Lo().getState().LL.LIZ();
                        if (c1198230hHpLIZ == null || (myMomentsData2 = c1198230hHpLIZ.LIZIZ) == null || (hashtagInfo2 = myMomentsData2.hashtagInfo) == null || (str2 = hashtagInfo2.hashtagName) == null) {
                            str2 = "";
                        }
                        c1389890mGx.LJIIJ(u.LJJIFFI(string, "%1$s", str2, false));
                        c1389890mGx.LJIIJJI();
                    }
                    if (myMomentsData != null && (hashtagInfo = myMomentsData.hashtagInfo) != null && (str = hashtagInfo.hashtagName) != null) {
                        ap(context, str);
                        return;
                    }
                    return;
                }
                if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    Activity activityLIZ2 = C1388190mED.LIZ(context);
                    if (activityLIZ2 == null) {
                        return;
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                    c1389890mGx2.LJIIJ(context.getString(2131823099));
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                View view2 = this.LLLIILIL;
                if (view2 != null) {
                    view2.setEnabled(false);
                }
                C1180880gpq c1180880gpq = C1180880gpq.LIZ;
                String str3 = Jo().LL.LIZ;
                if (myMomentsData != null) {
                    num = myMomentsData.userType;
                } else {
                    num = null;
                }
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                c1180880gpq.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str3);
                c2344009Gk.LJ(num, "is_poi_publish_new_user");
                C1180880gpq.LIZLLL(c2344009Gk);
                c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
                C1180880gpq.LJ(fragmentLJI, "ttls_my_year_campaign_highlights_click", c2344009Gk.LIZ);
                C339190DRl.LIZIZ(this.LLLIL);
                C339190DRl.LIZLLL(this.LLLILZ);
                ImageView imageView = this.LLLILZ;
                if (imageView != null) {
                    ObjectAnimator objectAnimator = this.LLLLLLL;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 0.0f, 360.0f);
                    objectAnimatorOfFloat.setDuration(1000L);
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    this.LLLLLLL = objectAnimatorOfFloat;
                }
                Context context2 = getContext();
                if (context2 != null && (view = this.LLLIILIL) != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(C1180060goW.LJII("#4DFF4C16"));
                    c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(49));
                    c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(49));
                    c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(49));
                    c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(49));
                    view.setBackground(c384050F3z.LIZ(context2));
                }
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLIZ);
                    c1389890mGx3.LJIIIZ(2131823058);
                    c1389890mGx3.LJIIJJI();
                }
                MyMomentsSharedViewModel myMomentsSharedViewModelLo = Lo();
                AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(this, 234);
                AnonymousClass0956 anonymousClass0956 = myMomentsSharedViewModelLo.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                myMomentsSharedViewModelLo.LLILLJJLI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myMomentsSharedViewModelLo), null, null, new C1198350hI1(myMomentsSharedViewModelLo, awS632S0100000_18, null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            C1389890mGx c1389890mGx4 = new C1389890mGx(c19egLIZ2);
            c1389890mGx4.LJIIIZ(2131823048);
            c1389890mGx4.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:26:0x0077, B:28:0x008b, B:30:0x008f, B:32:0x0093, B:33:0x0095, B:35:0x0099, B:36:0x009b, B:38:0x00a2, B:39:0x00a8, B:47:0x00b9, B:49:0x00c0), top: B:106:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:26:0x0077, B:28:0x008b, B:30:0x008f, B:32:0x0093, B:33:0x0095, B:35:0x0099, B:36:0x009b, B:38:0x00a2, B:39:0x00a8, B:47:0x00b9, B:49:0x00c0), top: B:106:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:26:0x0077, B:28:0x008b, B:30:0x008f, B:32:0x0093, B:33:0x0095, B:35:0x0099, B:36:0x009b, B:38:0x00a2, B:39:0x00a8, B:47:0x00b9, B:49:0x00c0), top: B:106:0x0077 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData r24, boolean r25, boolean r26, java.lang.Boolean r27, android.content.Context r28) {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem.Oo(com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsData, boolean, boolean, java.lang.Boolean, android.content.Context):void");
    }
}
