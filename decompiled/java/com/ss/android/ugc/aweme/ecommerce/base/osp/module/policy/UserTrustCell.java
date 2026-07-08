package com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03GB;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C1308910kAL;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C7734030i;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC804303Cf;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class UserTrustCell extends ECPowerCell<C7734030i> {
    public static final C03GB LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserTrustCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new C03GB();
    }

    public UserTrustCell() {
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 957);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(53);
        if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 968), awS577S0100000_33, AFwS224S0000000_33.get$arr$(146), new AwS577S0100000_33((C03K6) this, 943), new AwS577S0100000_33((C03K6) this, 945), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 947), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 949), null, new AwS577S0100000_33((C03K6) this, 950));
            return;
        }
        if (!(obj instanceof InterfaceC451590HnJ)) {
            if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 956), awS577S0100000_33, AFwS224S0000000_33.get$arr$(147), new AwS577S0100000_33((C03K6) this, 958), new AwS577S0100000_33((C03K6) this, 959), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 960), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 961), null, new AwS577S0100000_33((C03K6) this, 962));
                return;
            }
            if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 963), awS577S0100000_33, AFwS224S0000000_33.get$arr$(148), new AwS577S0100000_33((C03K6) this, 964), new AwS577S0100000_33((C03K6) this, 965), new AwS577S0100000_33((C03K6) this, 966), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 967));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 944);
        AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 946);
        AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 948);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 35));
        AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 951);
        AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 952);
        AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 953);
        AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 954);
        AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 955);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
        new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        Integer numLIZJ;
        int i2;
        int iLIZ;
        C7734030i c7734030i = (C7734030i) interfaceC1891350zJl;
        View view = this.itemView;
        if (!this.LL) {
            this.LL = true;
            C03J8.LIZ(view, false);
        }
        LinkRichText linkRichText = c7734030i.LLIZ;
        if (linkRichText != null && linkRichText.template != null) {
            if (linkRichText.arguments != null) {
                try {
                    String str = linkRichText.textColor;
                    if (str != null) {
                        iLIZ = Color.parseColor(str);
                    } else {
                        iLIZ = C960203pA.LIZ(R.attr.a1j, view.getContext());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    iLIZ = C960203pA.LIZ(R.attr.a1j, view.getContext());
                }
                TextView textView = (TextView) view.findViewById(R.id.rf2);
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                Context context = view.getContext();
                Integer numValueOf = Integer.valueOf(iLIZ);
                i = R.id.rf2;
                textView.setText(RichTextUtil.LJ(richTextUtil, context, linkRichText, numValueOf, 0, false, null, null, null, null, false, false, null, null, null, 16376));
                view.findViewById(R.id.rf2).setClickable(true);
                ((TextView) view.findViewById(R.id.rf2)).setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                i = R.id.rf2;
            }
            Integer num = c7734030i.LLIZLLLIL;
            int value = EnumC804303Cf.SEA_ONE_STEP.getValue();
            if (num != null && num.intValue() == value) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, view.getContext());
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
            }
            if (numLIZJ != null) {
                numLIZJ.intValue();
                View viewFindViewById = view.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundColor(numLIZJ.intValue());
                }
            }
            if (c7734030i.LLILZLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.ap2, viewGroup, false);
    }
}
