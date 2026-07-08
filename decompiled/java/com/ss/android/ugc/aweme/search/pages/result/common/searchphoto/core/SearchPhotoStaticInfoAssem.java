package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C01GW;
import X.C10EU;
import X.C10IT;
import X.C12P4;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1356610lPH;
import X.C13LE;
import X.C1558520qew;
import X.C1908030zkf;
import X.C23271099x;
import X.C296160BjC;
import X.C301450Brj;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C438710HIf;
import X.C650240Pew;
import X.C656980Ppo;
import X.C657060Ppw;
import X.C659750PuH;
import X.C661350Pwr;
import X.C662710Pz3;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C948503nH;
import X.EnumC657070Ppx;
import X.EnumC714850S2h;
import X.InterfaceC1587906Jp;
import X.InterfaceC657170Pq7;
import X.InterfaceC712990Rxx;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoStaticInfoAssem extends ReusedUIContentAssem<SearchPhotoStaticInfoAssem> implements InterfaceC712990Rxx<C659750PuH> {
    public Aweme LLJJJJJIL;
    public C662710Pz3 LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public FixedRatioFrameLayout LLJL;
    public ViewGroup LLJLIL;
    public View LLJLILLLLZIIL;
    public C12P4 LLJLL;
    public C12P4 LLJLLIL;
    public View LLJLLL;
    public C427870Gq9 LLJZ;
    public TuxTextView LLJZIJLIL;
    public TextView LLL;
    public ImageView LLLF;
    public ConstraintLayout LLLFF;
    public LinearLayout LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchPhotoViewModel.class), AFwS241S0000000_10.get$arr$(230));
    public final int LLLI = 41;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0315  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoStaticInfoAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        SpannableString spannableString;
        TuxTextView tuxTextView;
        List<TextExtraStruct> textExtra;
        User author;
        String nickname;
        View view;
        int i;
        TuxTextView tuxTextView2;
        CharSequence text;
        TuxTextView tuxTextView3;
        Aweme aweme;
        Object obj;
        InterfaceC657170Pq7 interfaceC657170Pq7;
        TuxTextView tuxTextView4;
        int i2;
        this.LLJJJJJIL = c659750PuH.LL;
        Context context = getContext();
        boolean z = true;
        int iIntValue = 0;
        if (context != null && (aweme = this.LLJJJJJIL) != null) {
            TuxTextView tuxTextView5 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(C1356610lPH.LJII(aweme.getCreateTime() * 1000, context));
                if (aweme.isAd()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C786410Ut5.LLLLZLL(tuxTextView5, i2);
            }
            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
            if (localTestApi != null && localTestApi.shouldCompatibleWithSearchUIAutoTest() && (tuxTextView4 = this.LLJJLIIIJLLLLLLLZ) != null) {
                tuxTextView4.setText("");
            }
            if (C301450Brj.LIZ()) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Object obj2 = ((C659750PuH) obj).LLILZ;
                if ((obj2 instanceof InterfaceC657170Pq7) && (interfaceC657170Pq7 = (InterfaceC657170Pq7) obj2) != null && interfaceC657170Pq7.LIZIZ()) {
                    TuxTextView tuxTextView6 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxTextView6 != null) {
                        C786410Ut5.B5(tuxTextView6, 0.0f);
                    }
                } else {
                    TuxTextView tuxTextView7 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxTextView7 != null) {
                        C786410Ut5.B5(tuxTextView7, 1.0f);
                    }
                }
            }
        }
        C12P4 c12p4 = this.LLJLL;
        if (c12p4 != null) {
            C786410Ut5.LLLLLLZ(c12p4, 8);
        }
        TuxTextView tuxTextView8 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView8 != null && tuxTextView8.getVisibility() == 0 && (tuxTextView2 = this.LLJJLIIIJLLLLLLLZ) != null && (text = tuxTextView2.getText()) != null && text.length() != 0 && (tuxTextView3 = this.LLJJLIIIJLLLLLLLZ) != null) {
            HandlerHook.viewPost(tuxTextView3, new ARunnableS110S0100000_10(this, 226));
        }
        Aweme aweme2 = this.LLJJJJJIL;
        if (aweme2 != null && (view = this.LLJLLL) != null) {
            C10IT.LIZ.getClass();
            if (C10IT.LJIIL(aweme2)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        Aweme aweme3 = this.LLJJJJJIL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            TuxTextView tuxTextView9 = this.LLJZIJLIL;
            if (tuxTextView9 == null) {
                tuxTextView9 = null;
            }
            if (C10EU.LJIJ(author)) {
                nickname = author.getUniqueId();
            } else {
                nickname = author.getNickname();
            }
            tuxTextView9.setText(nickname);
            if (C1908030zkf.LIZLLL(new UserVerify(null, author.getCustomVerify(), author.getEnterpriseVerifyReason(), -1))) {
                ImageView imageView = this.LLLF;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
            } else {
                ImageView imageView2 = this.LLLF;
                if (imageView2 != null) {
                    C786410Ut5.LJZI(8, imageView2);
                }
            }
            SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
            if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).videoImageAsyncLoad) {
                C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(author, this, 102));
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJIJL(getContext());
                if (((Number) C296160BjC.LIZ.getValue()).intValue() >= 1) {
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
                    c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
                }
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                c1331670kl3LJIIIIZZ.LIZLLL("AbsCellViewHolder");
                c1331670kl3LJIIIIZZ.LJJ(this.LLJZ);
                c1331670kl3LJIIIIZZ.LJIIJJI();
            }
        }
        if (((SearchPhotoViewModel) this.LLJJJJ.getValue()).LLILLL && !C650240Pew.LIZ()) {
            ConstraintLayout constraintLayout = this.LLLFF;
            if (constraintLayout != null) {
                C661350Pwr.LJIIIIZZ(C814420VxA.LIZIZ(TypedValue.applyDimension(1, 16, Resources.getSystem().getDisplayMetrics())), constraintLayout);
            }
        } else {
            ConstraintLayout constraintLayout2 = this.LLLFF;
            if (constraintLayout2 != null) {
                C661350Pwr.LJIIIIZZ(C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics())), constraintLayout2);
            }
        }
        Aweme aweme4 = this.LLJJJJJIL;
        if (aweme4 != null) {
            if (TextUtils.isEmpty(aweme4.getDesc())) {
                TextView textView = this.LLL;
                if (textView == null) {
                    textView = null;
                }
                textView.setText("");
                TextView textView2 = this.LLL;
                if (textView2 == null) {
                    textView2 = null;
                }
                C786410Ut5.LLIL(textView2, 8);
                IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAdjustAbility.class, null);
                if (iAdjustAbility != null) {
                    iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo("", 0));
                    return;
                }
                return;
            }
            TextView textView3 = this.LLL;
            if (textView3 == null) {
                textView3 = null;
            }
            C786410Ut5.LLIL(textView3, 0);
            List<TextExtraStruct> textExtra2 = aweme4.getTextExtra();
            String desc = aweme4.getDesc();
            if (aweme4.getTextExtra() == null || ((textExtra = aweme4.getTextExtra()) != null && textExtra.isEmpty())) {
                z = false;
            } else {
                Iterator<TextExtraStruct> it2 = aweme4.getTextExtra().iterator();
                while (it2.hasNext()) {
                    if (it2.next().isCommerce()) {
                        break;
                    }
                }
                z = false;
            }
            SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
            if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                if (z) {
                    ICommerceChallengeService iCommerceChallengeService = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
                    Aweme aweme5 = this.LLJJJJJIL;
                    iCommerceChallengeService.LJIJJLI(aweme5);
                    this.LLJJJJJIL = aweme5;
                }
            } else {
                ICommerceChallengeService iCommerceChallengeService2 = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
                Aweme aweme6 = this.LLJJJJJIL;
                iCommerceChallengeService2.LJIJJLI(aweme6);
                this.LLJJJJJIL = aweme6;
            }
            TextView textView4 = this.LLL;
            if (textView4 == null) {
                textView4 = null;
            }
            if ((textView4 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView4) != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxTextView.setTextColor(iIntValue);
                tuxTextView.setTuxFont(this.LLLI);
            }
            if (aweme4.getSearchDesc() != null) {
                if (aweme4.getHighlightInfoList() != null) {
                    C662710Pz3 c662710Pz3 = this.LLJJJJLIIL;
                    if (c662710Pz3 == null) {
                        c662710Pz3 = null;
                    }
                    spannableString = C662710Pz3.LIZIZ(c662710Pz3, aweme4.getSearchDesc());
                } else {
                    spannableString = new SpannableString(aweme4.getSearchDesc());
                }
            } else {
                spannableString = new SpannableString(aweme4.getDesc());
            }
            TextView textView5 = this.LLL;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setText(spannableString);
            if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
                if (z) {
                    ICommerceChallengeService iCommerceChallengeService3 = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
                    TextView textView6 = this.LLL;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    iCommerceChallengeService3.LJIILL(textView6, this.LLJJJJJIL, spannableString);
                }
            } else {
                ICommerceChallengeService iCommerceChallengeService4 = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class);
                TextView textView7 = this.LLL;
                if (textView7 == null) {
                    textView7 = null;
                }
                iCommerceChallengeService4.LJIILL(textView7, this.LLJJJJJIL, spannableString);
            }
            aweme4.setTextExtra(textExtra2);
            aweme4.setDesc(desc);
            TextView textView8 = this.LLL;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setMaxLines(2);
            C948503nH.LJ(this, C23271099x.INSTANCE, new C657060Ppw(this, spannableString, null));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
