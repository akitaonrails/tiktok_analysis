package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot;

import X.AbstractViewOnClickListenerC1231770i9v;
import X.C019F;
import X.C0ZOG;
import X.C0ZR2;
import X.C13LE;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1668706g9;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC899620ZQy;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot.FeedBackReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot.FeedbackViewModel;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class FeedBackReusedSkeletonUIContent extends ReusedSkeletonUIContentAssem<FeedBackReusedSkeletonUIContent, C0ZR2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedBackReusedSkeletonUIContent.class, "feedbackViewModel", "getFeedbackViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/feedback/slot/FeedbackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedBackReusedSkeletonUIContent() {
        super(C0ZOG.LIZ);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedbackViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 218), AFwS248S0000000_14.get$arr$(66), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = view.findViewById(R.id.k7n);
        this.LLJJL = view.findViewById(R.id.k7o);
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.k7k);
        this.LLJL = (TuxIconView) view.findViewById(R.id.k7l);
        Context context = getContext();
        if (context != null) {
            View view2 = this.LLJJJJLIIL;
            if (view2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(100));
                view2.setBackground(c384050F3z.LIZ(context));
            }
            View view3 = this.LLJJL;
            if (view3 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1e);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(100));
                view3.setBackground(c384050F3z2.LIZ(context));
            }
        }
    }

    public static void ip(TuxIconView tuxIconView, int i) {
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUIContentAssem
    public final void ep(final C869590Y9l c869590Y9l, C0ZR2 c0zr2) {
        int i;
        int i2;
        final C0ZR2 c0zr22 = c0zr2;
        if (c0zr22.LIZ) {
            C1584506Ih.LIZIZ(LJJIJL());
            if (c0zr22.LIZJ) {
                i = R.raw.icon_thumbs_up_fill;
            } else {
                i = R.raw.icon_thumbs_up;
            }
            ip(this.LLJJLIIIJLLLLLLLZ, i);
            if (c0zr22.LIZLLL) {
                i2 = R.raw.icon_thumbs_down_fill;
            } else {
                i2 = R.raw.icon_thumbs_down;
            }
            ip(this.LLJL, i2);
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0ZR1
                    @Override // X.AbstractViewOnClickListenerC1231770i9v
                    public final void LIZ(View view2) {
                        EnumC899620ZQy enumC899620ZQy = c0zr22.LIZIZ;
                        EnumC899620ZQy enumC899620ZQy2 = EnumC899620ZQy.SMART_REPLY;
                        if (enumC899620ZQy != enumC899620ZQy2) {
                            FeedBackReusedSkeletonUIContent.ip(this.LLJJLIIIJLLLLLLLZ, R.raw.icon_thumbs_up_fill);
                        }
                        FeedBackReusedSkeletonUIContent feedBackReusedSkeletonUIContent = this;
                        Context context = feedBackReusedSkeletonUIContent.getContext();
                        C0ZR2 c0zr23 = c0zr22;
                        C869590Y9l c869590Y9l2 = c869590Y9l;
                        AssemVMLazy assemVMLazy = feedBackReusedSkeletonUIContent.LLJJJJJIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FeedBackReusedSkeletonUIContent.LLJLIL;
                        assemVMLazy.getValue();
                        if (context == null) {
                            context = feedBackReusedSkeletonUIContent.getContext();
                        }
                        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(feedBackReusedSkeletonUIContent, 1496);
                        FeedbackViewModel.vQ2(c869590Y9l2, c0zr23, true);
                        if (c0zr23.LIZIZ == enumC899620ZQy2) {
                            IMAIServiceAPI.LIZ.getClass();
                            AnonymousClass0629.LIZ().LIZ().LJIILLIIL(context, c869590Y9l2, true, "feed_back_btn");
                        } else {
                            awS558S0100000_14.invoke();
                        }
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06S7(feedBackReusedSkeletonUIContent, null), 3);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1000L);
                    }
                }, view);
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0ZR0
                    @Override // X.AbstractViewOnClickListenerC1231770i9v
                    public final void LIZ(View view3) {
                        if (c0zr22.LIZIZ != EnumC899620ZQy.SMART_REPLY) {
                            FeedBackReusedSkeletonUIContent.ip(this.LLJL, R.raw.icon_thumbs_down_fill);
                        }
                        FeedBackReusedSkeletonUIContent feedBackReusedSkeletonUIContent = this;
                        Context context = feedBackReusedSkeletonUIContent.getContext();
                        C0ZR2 c0zr23 = c0zr22;
                        C869590Y9l c869590Y9l2 = c869590Y9l;
                        AssemVMLazy assemVMLazy = feedBackReusedSkeletonUIContent.LLJJJJJIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FeedBackReusedSkeletonUIContent.LLJLIL;
                        assemVMLazy.getValue();
                        if (context == null) {
                            context = feedBackReusedSkeletonUIContent.getContext();
                        }
                        FeedbackViewModel.vQ2(c869590Y9l2, c0zr23, false);
                        int i3 = C899630ZQz.LIZ[c0zr23.LIZIZ.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                if (context != null) {
                                    SmartRouter.buildRoute(context, C1668706g9.LIZ(IIMBusinessChatService.LIZ).getFeedbackService().LIZIZ(c869590Y9l2)).open();
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else if (context != null) {
                            IMAIServiceAPI.LIZ.getClass();
                            AnonymousClass0629.LIZ().LIZ().LJIILLIIL(context, c869590Y9l2, false, "feed_back_btn");
                        }
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06S7(feedBackReusedSkeletonUIContent, null), 3);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1000L);
                    }
                }, view2);
            }
            AssemVMLazy assemVMLazy = this.LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
            FeedbackViewModel feedbackViewModel = (FeedbackViewModel) assemVMLazy.getValue();
            if (c0zr22.LIZIZ == EnumC899620ZQy.B2C && !feedbackViewModel.LL.contains(c869590Y9l.getUuid())) {
                C1668706g9.LIZ(IIMBusinessChatService.LIZ).getFeedbackService().LIZLLL(c869590Y9l);
                feedbackViewModel.LL.add(c869590Y9l.getUuid());
                return;
            }
            return;
        }
        C1584506Ih.LIZ(LJJIJL());
    }
}
