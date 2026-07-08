package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C07E5;
import X.C0HXV;
import X.C0Q18;
import X.C1010120cOQ;
import X.C10EU;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1356610lPH;
import X.C138700fx;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1591860rWi;
import X.C1744700vVE;
import X.C1822307Bt;
import X.C1840207Iq;
import X.C1908030zkf;
import X.C256490A3j;
import X.C418040GaI;
import X.C419890GdH;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C426750GoL;
import X.C427870Gq9;
import X.C438710HIf;
import X.C650240Pew;
import X.C655610Pnb;
import X.C656400Pos;
import X.C656870Ppd;
import X.C657990PrR;
import X.C659720PuE;
import X.C661350Pwr;
import X.C662390PyX;
import X.C662710Pz3;
import X.C666750QDh;
import X.C723580SZw;
import X.C723830SaL;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.C823050WQl;
import X.EnumC656000PoE;
import X.EnumC656860Ppc;
import X.EnumC657070Ppx;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC655340PnA;
import X.InterfaceC657510Pqf;
import X.InterfaceC662700Pz2;
import X.InterfaceC712990Rxx;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchCardBottomRecommentInfoAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public class SearchCardBottomBarAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public C662710Pz3 LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C427870Gq9 LLJLLIL;
    public ImageView LLJLLL;
    public TuxIconView LLJZ;
    public ViewGroup LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public View LLLFF;
    public View LLLFFI;
    public TuxTextView LLLFZ;
    public Aweme LLLI;
    public boolean LLLII;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C656870Ppd.class, null), checkSupervisorPrepared());
    public final EnumC656860Ppc LLJL = EnumC656860Ppc.NONE;
    public final int LLLIIII = 41;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final boolean Ap() {
        C656870Ppd c656870Ppd = (C656870Ppd) this.LLJJLIIIJLLLLLLLZ.getValue();
        return c656870Ppd != null && c656870Ppd.LLILLJJLI;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        if (this.LLLII) {
            EventBus.LIZLLL().LJJI(this);
            this.LLLII = false;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return Ap() ? R.layout.evp : R.layout.evo;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (this.LLLII) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        this.LLLII = true;
    }

    public EnumC656860Ppc yp() {
        return this.LLJL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserDiggUpdated(C737030Svd c737030Svd) {
        String aid;
        if (c737030Svd.LIZ == 13) {
            Object obj = c737030Svd.LIZIZ;
            Integer numValueOf = null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            Aweme aweme = this.LLLI;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(obj, aid)) {
                Aweme aweme2 = this.LLLI;
                Bundle bundle = c737030Svd.LIZJ;
                if (bundle != null) {
                    numValueOf = Integer.valueOf(bundle.getInt("user_digged"));
                }
                up(aweme2, numValueOf);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        View view2;
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, view, 29));
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.desc);
        this.LLLFF = view.findViewById(R.id.fmz);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bc6);
        this.LLJLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextDirection(5);
        }
        C662390PyX c662390PyX = C662390PyX.LIZ;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.bbz);
        c662390PyX.getClass();
        C662390PyX.LJ(smartImageView, true);
        this.LLJLLIL = (C427870Gq9) smartImageView;
        this.LLJLLL = (ImageView) view.findViewById(R.id.bcd);
        this.LLJZ = (TuxIconView) view.findViewById(R.id.a_6);
        this.LLJZIJLIL = (ViewGroup) view.findViewById(R.id.ynk);
        this.LLLFFI = view.findViewById(R.id.bc5);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.mnh);
        if (tuxTextView2 != null) {
            if (C666750QDh.LIZ()) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                tuxTextView2 = null;
            }
        } else {
            tuxTextView2 = null;
        }
        this.LLL = tuxTextView2;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.tv_watching_count);
        this.LLLF = tuxTextView3;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        this.LLLFZ = (TuxTextView) view.findViewById(R.id.tv_search_video_cell_bottom_publish_time);
        if (Ap()) {
            TuxTextView tuxTextView4 = this.LLLFZ;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
        } else {
            C427870Gq9 c427870Gq9 = this.LLJLLIL;
            if (c427870Gq9 != null && (layoutParams = c427870Gq9.getLayoutParams()) != null) {
                layoutParams.width = (int) C418040GaI.LIZ(20);
                layoutParams.height = (int) C418040GaI.LIZ(20);
            }
            TuxTextView tuxTextView5 = this.LLJLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setTuxFont(61);
            }
            TuxTextView tuxTextView6 = this.LLL;
            if (tuxTextView6 != null) {
                tuxTextView6.setTuxFont(61);
            }
            TuxTextView tuxTextView7 = this.LLLF;
            if (tuxTextView7 != null) {
                tuxTextView7.setTuxFont(61);
            }
        }
        if (C650240Pew.LIZ()) {
            View view3 = this.LLLFF;
            if (view3 != null) {
                C650240Pew.LIZ.getClass();
                C661350Pwr.LJIIJJI(C650240Pew.LJFF, view3);
            }
            View view4 = this.LLLFF;
            if (view4 != null) {
                C650240Pew.LIZ.getClass();
                C0HXV.LIZLLL(C650240Pew.LJ, view4);
            }
            View view5 = this.LLLFF;
            if (view5 != null) {
                C650240Pew.LIZ.getClass();
                C0HXV.LJ(C650240Pew.LJ, view5);
            }
            if (((Number) C1822307Bt.LIZ.getValue()).intValue() != 0 && (view2 = this.LLLFF) != null) {
                C650240Pew.LIZ.getClass();
                C1744700vVE.LJIIIIZZ(C650240Pew.LIZLLL(), view2);
            }
            TuxTextView tuxTextView8 = this.LLJLILLLLZIIL;
            C650240Pew.LIZ.getClass();
            C661350Pwr.LJIIIIZZ(0, tuxTextView8);
            View view6 = this.LLLFFI;
            if (view6 != null) {
                C661350Pwr.LJIIJJI(C650240Pew.LJII, view6);
            }
        } else {
            Integer num = 0;
            if (num.intValue() > 0) {
                int iIntValue = num.intValue();
                View view7 = this.LLLFF;
                if (view7 != null) {
                    C661350Pwr.LJIIJJI((int) C418040GaI.LIZ(iIntValue), view7);
                }
                View view8 = this.LLLFF;
                if (view8 != null) {
                    C1591860rWi.LJFF((int) C418040GaI.LIZ(iIntValue), view8);
                }
                TuxTextView tuxTextView9 = this.LLJLILLLLZIIL;
                if (tuxTextView9 != null) {
                    C661350Pwr.LJIIIIZZ((int) C418040GaI.LIZ(iIntValue), tuxTextView9);
                }
                TuxTextView tuxTextView10 = this.LLJLILLLLZIIL;
                if (tuxTextView10 != null) {
                    C0HXV.LIZIZ(0, tuxTextView10);
                }
            }
        }
        this.LLJLIL = new C662710Pz3(new InterfaceC662700Pz2() { // from class: X.0Ppk
            @Override // X.InterfaceC662700Pz2
            public final List<HighlightInfo> LIZ() {
                Aweme aweme = this.LIZ.LLLI;
                if (aweme != null) {
                    return aweme.getHighlightInfoList();
                }
                return null;
            }

            @Override // X.InterfaceC662700Pz2
            public final List LIZIZ(String str) {
                Context context;
                int iIntValue2;
                if (Intrinsics.LJFF(str, "search_desc") && (context = this.LIZ.getContext()) != null) {
                    Object[] objArr = new Object[2];
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    objArr[0] = new ForegroundColorSpan(iIntValue2);
                    objArr[1] = new C444920HcY(62, true);
                    return C1697810uHb.LJ(objArr);
                }
                return null;
            }
        });
    }

    public void op(Aweme aweme) {
        User author;
        TuxTextView tuxTextView;
        String nickname;
        if (aweme != null && (author = aweme.getAuthor()) != null && (tuxTextView = this.LLJLL) != null) {
            if (C10EU.LJIJ(author)) {
                nickname = author.getUniqueId();
            } else {
                nickname = author.getNickname();
            }
            tuxTextView.setText(nickname);
        }
    }

    public void sp(Aweme aweme) {
        User author;
        if (C1010120cOQ.LJJJIL(aweme)) {
            TuxIconView tuxIconView = this.LLJZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            ImageView imageView = this.LLJLLL;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            TuxIconView tuxIconView2 = this.LLJZ;
            if (tuxIconView2 != null) {
                C657990PrR.LIZJ(tuxIconView2, AFwS236S0000000_6.get$arr$(267));
            }
            TuxTextView tuxTextView = this.LLJLL;
            if (tuxTextView != null) {
                C657990PrR.LIZJ(tuxTextView, AFwS236S0000000_6.get$arr$(268));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJZ;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            if (C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                ImageView imageView2 = this.LLJLLL;
                if (imageView2 != null) {
                    C786410Ut5.LJZI(0, imageView2);
                    return;
                }
                return;
            }
            ImageView imageView3 = this.LLJLLL;
            if (imageView3 == null) {
                return;
            }
            C786410Ut5.LJZI(8, imageView3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tp(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem.tp(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public void up(InterfaceC435460H5s interfaceC435460H5s) {
        InterfaceC655340PnA interfaceC655340PnA;
        Aweme aweme;
        Aweme aweme2;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        C0Q18 c0q18LIZIZ;
        Context context;
        TuxTextView tuxTextView;
        boolean zLJFF;
        int i;
        String strLIZ;
        User author;
        this.LLLI = interfaceC435460H5s.getAweme();
        tp(this.LLLI);
        Aweme aweme3 = this.LLLI;
        op(aweme3);
        sp(aweme3);
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
            if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).videoImageAsyncLoad) {
                C823050WQl.LIZJ().execute(new ARunnableS75S0200000_6(author, this, 80));
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                c1331670kl3LJIIIIZZ.LIZLLL("SearchCardBottomAssem");
                c1331670kl3LJIIIIZZ.LJJ(this.LLJLLIL);
                c1331670kl3LJIIIIZZ.LJIIJJI();
            }
        }
        up(this.LLLI, null);
        Aweme aweme4 = this.LLLI;
        if (aweme4 != null && (context = getContext()) != null && yp() == EnumC656860Ppc.WATCH_COUNT && (tuxTextView = this.LLLF) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            if (C1840207Iq.LIZ()) {
                GeccContentSellingPoint geccContentSellingPoint = aweme4.getGeccContentSellingPoint();
                if (geccContentSellingPoint != null) {
                    zLJFF = Intrinsics.LJFF(geccContentSellingPoint.type, "live_likes_amount");
                    strLIZ = geccContentSellingPoint.text;
                    if (strLIZ == null || (!Intrinsics.LJFF(geccContentSellingPoint.type, "ec_live_user_amount") && !Intrinsics.LJFF(geccContentSellingPoint.type, "live_likes_amount"))) {
                    }
                    tuxTextView.setText(strLIZ);
                } else {
                    zLJFF = false;
                }
                strLIZ = C656400Pos.LIZ(aweme4);
                tuxTextView.setText(strLIZ);
            } else {
                tuxTextView.setText(C656400Pos.LIZ(aweme4));
                zLJFF = false;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (zLJFF) {
                i = R.raw.icon_like;
            } else {
                i = R.raw.icon_person;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            float f = 14;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            if (!C426750GoL.LIZLLL(context)) {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            }
        }
        TuxTextView tuxTextView2 = this.LLLFZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C1356610lPH.LJII(interfaceC435460H5s.getAweme().getCreateTime() * 1000, getContentView().getContext()));
        }
        if (AwemeSaaSExtKt.isLive(interfaceC435460H5s.getAweme()) || (interfaceC435460H5s.getAweme().isAd() && !((Boolean) C138700fx.LIZ.getValue()).booleanValue())) {
            TuxTextView tuxTextView3 = this.LLLFZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        } else {
            TuxTextView tuxTextView4 = this.LLLFZ;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
        }
        if (((Boolean) C256490A3j.LIZ.getValue()).booleanValue() && (aweme = this.LLLI) != null && aweme.isAd() && (aweme2 = this.LLLI) != null && C1010120cOQ.LIZ(aweme2, EnumC656000PoE.SEARCH_AD_NORMAL_VIDEO_DESC.getValue()) && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null && (c0q18LIZIZ = interfaceC657510PqfLIZLLL.LIZIZ(this.LLLI, null, false, false)) != null) {
            c0q18LIZIZ.Xq2(EnumC656000PoE.SEARCH_AD_NORMAL_VIDEO_DESC.getValue(), this.LLJZIJLIL);
            TuxTextView tuxTextView5 = this.LLJLILLLLZIIL;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
            View view = this.LLLFFI;
            if (view != null) {
                C661350Pwr.LJIIJJI(0, view);
            }
        }
        if ((interfaceC435460H5s instanceof InterfaceC655340PnA) && (interfaceC655340PnA = (InterfaceC655340PnA) interfaceC435460H5s) != null && interfaceC655340PnA.getReason() != null) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchCardBottomRecommentInfoAssem.class), true, null);
            return;
        }
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAdjustAbility.class, null);
        if (iAdjustAbility == null) {
            return;
        }
        iAdjustAbility.qw1(EnumC657070Ppx.BOTTOM_RECOMMEND_INFO, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void up(Aweme aweme, Integer num) {
        Long lValueOf;
        int iIntValue;
        int i;
        int i2;
        Integer numValueOf;
        long jLongValue;
        if (aweme != null && yp() == EnumC656860Ppc.LIEK_COUNT) {
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (num != null) {
                aweme.setUserDigg(num.intValue());
            }
            Integer numValueOf2 = Integer.valueOf(aweme.getUserDigg());
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                lValueOf = Long.valueOf(statistics.getDiggCount());
            } else {
                lValueOf = null;
            }
            Context context = getContext();
            if (context != null) {
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                } else {
                    iIntValue = 0;
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (iIntValue == 1) {
                    i = R.raw.icon_like_fill;
                } else {
                    i = R.raw.icon_like;
                }
                c419910GdJ.LIZ = i;
                if (iIntValue == 1) {
                    numValueOf = Integer.valueOf(R.attr.a04);
                } else {
                    C659720PuE.LIZ.getClass();
                    if (C659720PuE.LIZJ()) {
                        i2 = R.attr.a1j;
                    } else {
                        i2 = R.attr.a1k;
                    }
                    numValueOf = Integer.valueOf(i2);
                }
                c419910GdJ.LJ = numValueOf;
                C659720PuE.LIZ.getClass();
                if (C659720PuE.LIZJ()) {
                    float f = 12;
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                } else {
                    float f2 = 14;
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                }
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                c419890GdHLIZIZ.LIZIZ(0, C814420VxA.LIZIZ(TypedValue.applyDimension(1, 2, Resources.getSystem().getDisplayMetrics())), C426750GoL.LIZLLL(context));
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                CharSequence charSequenceLIZ = C820940WIi.LIZ(jLongValue);
                TuxTextView tuxTextView2 = this.LLL;
                if (tuxTextView2 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "x");
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                    spannableStringBuilder.append(charSequenceLIZ);
                    tuxTextView2.setText(spannableStringBuilder);
                }
            }
        }
    }
}
