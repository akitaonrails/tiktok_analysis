package com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.powerlist;

import X.AbstractC1052910dVR;
import X.AbstractC1843910y5F;
import X.C06VX;
import X.C0GY9;
import X.C0XF1;
import X.C1022620cia;
import X.C1052900dVQ;
import X.C1052920dVS;
import X.C1052930dVT;
import X.C1052940dVU;
import X.C1203310hQ1;
import X.C1247530iZL;
import X.C1260120ite;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1697810uHb;
import X.C1844090y5X;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2215101Bmm;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1779110wOj;
import X.InterfaceC1519705xD;
import X.InterfaceC1891350zJl;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS96S0200000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ReviewCell extends PowerCell<C1844090y5X> implements View.OnLongClickListener {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C1203310hQ1 LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public C06VX LLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C1022620cia.LIZ("ReviewCell", "onItemViewCreated");
        this.LL = (C1203310hQ1) this.itemView.findViewById(R.id.srd);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.zz2);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.tv_review);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.lmj);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.zts);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.zgh);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.f838zga);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.hin);
        this.LLJ = this.itemView.findViewById(R.id.tv_retry);
        this.LLJI = (C06VX) this.itemView.findViewById(R.id.thc);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 32), this.itemView.findViewById(R.id.mo0));
        this.itemView.setOnLongClickListener(this);
        C1260120ite.LIZIZ(new ARunnableS96S0200000_27(this.itemView, this, 7));
    }

    public final void L5(C1844090y5X c1844090y5X) {
        int i;
        Locale locale;
        int i2;
        View view = this.LLIZLLLIL;
        int i3 = 0;
        if (view != null) {
            if (c1844090y5X.LLILLJJLI == EnumC1779110wOj.IDLE) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            String str = c1844090y5X.LL.country;
            String displayCountry = null;
            if (str != null) {
                Context context = this.itemView.getContext();
                Locale locale2 = Locale.ENGLISH;
                Resources resources = context.getResources();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("country_");
                sbLIZ.append(str.toLowerCase(Locale.ROOT));
                int iN3 = C786410Ut5.n3(resources, C2188811AlT.LIZIZ(sbLIZ), "string", context.getPackageName());
                if (iN3 != 0) {
                    displayCountry = context.getString(iN3);
                } else {
                    if (Build.VERSION.SDK_INT >= 24) {
                        locale = context.getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = context.getResources().getConfiguration().locale;
                    }
                    displayCountry = new Locale("", str).getDisplayCountry(locale);
                    if (displayCountry.length() <= 0) {
                        displayCountry = new Locale("", str).getDisplayCountry(locale2);
                    }
                }
            }
            tuxTextView.setText(displayCountry);
        }
        View view2 = this.LLJ;
        if (view2 != null) {
            if (c1844090y5X.LLILLJJLI == EnumC1779110wOj.PUBLISH_FAILED) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS129S0200000_27(c1844090y5X, this, 8), view3);
        }
        AbstractC1052910dVR abstractC1052910dVR = c1844090y5X.LLILLL;
        if (Intrinsics.LJFF(abstractC1052910dVR, C1052930dVT.LIZ)) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c1844090y5X.LL.text);
            }
        } else if (abstractC1052910dVR instanceof C1052940dVU) {
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(c1844090y5X.LL.text);
            }
        } else if (abstractC1052910dVR instanceof C1052900dVQ) {
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(((C1052900dVQ) abstractC1052910dVR).LIZ);
            }
        } else if (!Intrinsics.LJFF(abstractC1052910dVR, C1052920dVS.LIZ)) {
            throw new C1954807lC();
        }
        boolean zLJFF = Intrinsics.LJFF(abstractC1052910dVR, C1052920dVS.LIZ);
        C06VX c06vx = this.LLJI;
        if (c06vx != null) {
            if (!zLJFF) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, c06vx);
        }
        C06VX c06vx2 = this.LLJI;
        if (c06vx2 != null) {
            c06vx2.setLoading(zLJFF);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C1203310hQ1 c1203310hQ1;
        int i;
        C1844090y5X c1844090y5X = (C1844090y5X) interfaceC1891350zJl;
        C1022620cia.LIZ("ReviewCell", "onBindItemView");
        super.onBindItemView(c1844090y5X);
        Review review = c1844090y5X.LL;
        float f = review.rating;
        if (f > 1.0E-7d) {
            z = true;
        } else {
            z = false;
        }
        C1203310hQ1 c1203310hQ12 = this.LL;
        if (c1203310hQ12 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c1203310hQ12);
        }
        if (z && (c1203310hQ1 = this.LL) != null) {
            c1203310hQ1.setValue(f);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(review.nickname);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(review.text);
        }
        TuxTextView tuxTextView3 = this.LLILZLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C2215101Bmm.LJ(review.createTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
        TuxTextView tuxTextView4 = this.LLIZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(review.country);
        }
        L5(c1844090y5X);
        I5(c1844090y5X.LL, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cug, viewGroup, false);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FragmentManager childFragmentManager;
        EnumC1779110wOj enumC1779110wOj;
        int i;
        int i2;
        C1247530iZL c1247530iZL;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ == null || (childFragmentManager = fragmentLIZ.getChildFragmentManager()) == null) {
            return true;
        }
        C1844090y5X item = getItem();
        String curUserId = null;
        if (item != null) {
            enumC1779110wOj = item.LLILLJJLI;
        } else {
            enumC1779110wOj = null;
        }
        if (enumC1779110wOj != EnumC1779110wOj.IDLE) {
            return true;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        String strValueOf = String.valueOf(item.LL.userId);
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null) {
            curUserId = iAccountUserService.getCurUserId();
        }
        if (Intrinsics.LJFF(strValueOf, curUserId)) {
            c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_trash_bin);
            c1247530iZL.LIZIZ(R.string.gm7);
            c1247530iZL.LIZ(new AwS393S0200000_27(this, item, 25));
        } else {
            if (!Intrinsics.LJFF(item.LLILLL, C1052930dVT.LIZ) && !(item.LLILLL instanceof C1052940dVU)) {
                i = R.string.suj;
                i2 = R.raw.icon_languages_tick;
            } else {
                i = 2131850744;
                i2 = R.raw.icon_languages;
            }
            c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(i2);
            c1247530iZL.LIZIZ(i);
            c1247530iZL.LIZ(new AwS393S0200000_27(this, item, 26));
        }
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZJ(R.raw.icon_doc_on_doc);
        c1247530iZL2.LIZIZ(2131829536);
        c1247530iZL2.LIZ(new AwS600S0100000_21(this, 34));
        c1390850mIV.LJFF(C1697810uHb.LJIIJJI(c1247530iZL, c1247530iZL2));
        c1390850mIV.LIZJ().show(childFragmentManager, "ads_review_tab_menu");
        return true;
    }

    public final void I5(Review review, boolean z) {
        int i;
        int i2;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(String.valueOf(review.diggCount));
        }
        boolean z2 = review.userDiggStatus;
        if (z2) {
            i = R.attr.a1r;
        } else {
            i = R.attr.a1h;
        }
        if (z && (tuxTextView = this.LLILZIL) != null) {
            tuxTextView.setTextColorRes(i);
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(0L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat);
            animatorSet.start();
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z2) {
                i2 = R.raw.icon_heart_fill;
            } else {
                i2 = R.raw.icon_heart;
            }
            c419910GdJ.LIZ = i2;
            c419910GdJ.LJ = Integer.valueOf(i);
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
    }

    public final void N5(AbstractC1843910y5F abstractC1843910y5F, boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                InterfaceC1519705xD.LIZ.getClass();
                if (!C0XF1.LIZLLL(context)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                    return;
                }
            } else {
                return;
            }
        }
        ReviewViewModel reviewViewModel = (ReviewViewModel) getFragmentViewModel(ReviewViewModel.class, null);
        if (reviewViewModel != null) {
            reviewViewModel.AQ2(abstractC1843910y5F);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1844090y5X c1844090y5X = (C1844090y5X) interfaceC1891350zJl;
        super.onBindItemView(c1844090y5X, list);
        L5(c1844090y5X);
        I5(c1844090y5X.LL, true);
    }
}
