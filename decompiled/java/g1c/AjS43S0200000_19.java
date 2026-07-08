package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031E;
import X.C031F;
import X.C03IJ;
import X.C03K6;
import X.C1143000fqk;
import X.C1210470hbZ;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C452080Ho6;
import X.C452501pT;
import X.C5182020e;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableExpendCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USUnreachableExpandCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AjS43S0200000_19 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS43S0200000_19 ajS43S0200000_19, View view) {
        if (view != null) {
            C1210470hbZ.LIZ.getClass();
            C1210470hbZ.LIZIZ = "click_privacy_setting_video";
            String eventType = ((StoryMixedFeedDetailPanel) ajS43S0200000_19.l0).LLLLIIIILLL.getEventType();
            String str = "null";
            if (eventType == null) {
                eventType = "null";
            }
            C1210470hbZ.LIZJ = eventType;
            C1210470hbZ.LIZLLL = "story";
            C1210470hbZ.LIZ();
            Aweme awemeLLLLLJLJLL = ((StoryMixedFeedDetailPanel) ajS43S0200000_19.l0).LLLLLJLJLL();
            if (awemeLLLLLJLJLL != null) {
                ShareDependService.LIZ.getClass();
                ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
                Context context = ((TuxTextView) ajS43S0200000_19.l1).getContext();
                String eventType2 = ((StoryMixedFeedDetailPanel) ajS43S0200000_19.l0).LLLLIIIILLL.getEventType();
                if (eventType2 != null) {
                    str = eventType2;
                }
                shareDependServiceLJJJJI.LJIJJ(context, awemeLLLLLJLJLL, "", str, "bottom_bar", "", false, false);
            }
        }
    }

    public static final void LIZ$1(AjS43S0200000_19 ajS43S0200000_19, View view) {
        AssemVMLazy assemVMLazy;
        Function0 awS563S0100000_19;
        Function0 awS563S0100000_192;
        Function0 awS563S0100000_193;
        if (view != null) {
            USUnreachableExpandCell uSUnreachableExpandCell = (USUnreachableExpandCell) ajS43S0200000_19.l0;
            Object obj = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 418);
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(712);
            if (Intrinsics.LJFF(obj, obj)) {
                AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 3103);
                AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(703);
                AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19((C03K6) uSUnreachableExpandCell, 3104);
                AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1275);
                if ((uSUnreachableExpandCell instanceof HasDefaultViewModelProviderFactory) && uSUnreachableExpandCell != null) {
                    awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) uSUnreachableExpandCell, 3106);
                } else {
                    awS563S0100000_193 = C1143000fqk.LIZ;
                }
                assemVMLazy = new AssemVMLazy(awS563S0100000_194, c5182020e, aFwS207S0000000_19, awS563S0100000_195, awS550S0100000_6, awS563S0100000_193, aFwS257S0000000_19, new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1278), null, new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1279));
            } else if (obj instanceof InterfaceC451590HnJ) {
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) uSUnreachableExpandCell, 746);
                if ((uSUnreachableExpandCell instanceof HasDefaultViewModelProviderFactory) && uSUnreachableExpandCell != null) {
                    awS563S0100000_192 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) uSUnreachableExpandCell, 3105);
                } else {
                    awS563S0100000_192 = C1143000fqk.LIZ;
                }
                AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c19719912DlLIZ, 3107);
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS551S0100000_7, 175));
                AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 3108);
                AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 3110);
                AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 3111);
                AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 3112);
                AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 3113);
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
                assemVMLazy = new AssemVMLazy(awS563S0100000_196, c5182020e, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_192, aFwS257S0000000_19, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
            } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c19719912DlLIZ, 3115);
                AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(704);
                AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19((C03K6) uSUnreachableExpandCell, 3119);
                AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1283);
                if ((uSUnreachableExpandCell instanceof HasDefaultViewModelProviderFactory) && uSUnreachableExpandCell != null) {
                    awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) uSUnreachableExpandCell, 3121);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
                assemVMLazy = new AssemVMLazy(awS563S0100000_1912, c5182020e, aFwS207S0000000_192, awS563S0100000_1913, awS550S0100000_62, awS563S0100000_19, aFwS257S0000000_19, new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1284), null, new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1285));
            } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 3123), c5182020e, AFwS207S0000000_19.get$arr$(705), new AwS551S0100000_7((C03K6) uSUnreachableExpandCell, 748), new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1288), new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1272), aFwS257S0000000_19, null, null, new AwS550S0100000_6((C03K6) uSUnreachableExpandCell, 1273));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = USUnreachableExpandCell.LLJ;
            assemVMLazy.getValue().setState(new AwS580S0100000_1(new C031F(!r2.LL, ((C031F) ajS43S0200000_19.l1).LLILLJJLI), 404));
        }
    }

    public static final void LIZ$2(AjS43S0200000_19 ajS43S0200000_19, View view) {
        AssemVMLazy assemVMLazy;
        Function0 awS563S0100000_19;
        Function0 awS563S0100000_192;
        Function0 awS563S0100000_193;
        if (view != null) {
            UnreachableExpendCell unreachableExpendCell = (UnreachableExpendCell) ajS43S0200000_19.l0;
            Object obj = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 623);
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(794);
            if (Intrinsics.LJFF(obj, obj)) {
                AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 3377);
                AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(815);
                AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19((C03K6) unreachableExpendCell, 3378);
                AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((C03K6) unreachableExpendCell, 1590);
                if ((unreachableExpendCell instanceof HasDefaultViewModelProviderFactory) && unreachableExpendCell != null) {
                    awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) unreachableExpendCell, 3380);
                } else {
                    awS563S0100000_193 = C1143000fqk.LIZ;
                }
                assemVMLazy = new AssemVMLazy(awS563S0100000_194, c5182020e, aFwS207S0000000_19, awS563S0100000_195, awS550S0100000_6, awS563S0100000_193, aFwS257S0000000_19, new AwS550S0100000_6((C03K6) unreachableExpendCell, 1593), null, new AwS550S0100000_6((C03K6) unreachableExpendCell, 1594));
            } else if (obj instanceof InterfaceC451590HnJ) {
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) unreachableExpendCell, 813);
                if ((unreachableExpendCell instanceof HasDefaultViewModelProviderFactory) && unreachableExpendCell != null) {
                    awS563S0100000_192 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) unreachableExpendCell, 3379);
                } else {
                    awS563S0100000_192 = C1143000fqk.LIZ;
                }
                AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c19719912DlLIZ, 3381);
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS551S0100000_7, 212));
                AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 3382);
                AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 3384);
                AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 3385);
                AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 3386);
                AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 3387);
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
                assemVMLazy = new AssemVMLazy(awS563S0100000_196, c5182020e, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_192, aFwS257S0000000_19, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
            } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
                AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c19719912DlLIZ, 3367);
                AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(813);
                AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19((C03K6) unreachableExpendCell, 3371);
                AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((C03K6) unreachableExpendCell, 1580);
                if ((unreachableExpendCell instanceof HasDefaultViewModelProviderFactory) && unreachableExpendCell != null) {
                    awS563S0100000_19 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) unreachableExpendCell, 3374);
                } else {
                    awS563S0100000_19 = C1143000fqk.LIZ;
                }
                assemVMLazy = new AssemVMLazy(awS563S0100000_1912, c5182020e, aFwS207S0000000_192, awS563S0100000_1913, awS550S0100000_62, awS563S0100000_19, aFwS257S0000000_19, new AwS550S0100000_6((C03K6) unreachableExpendCell, 1581), null, new AwS550S0100000_6((C03K6) unreachableExpendCell, 1582));
            } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 3375), c5182020e, AFwS207S0000000_19.get$arr$(814), new AwS551S0100000_7((C03K6) unreachableExpendCell, 811), new AwS550S0100000_6((C03K6) unreachableExpendCell, 1584), new AwS550S0100000_6((C03K6) unreachableExpendCell, 1587), aFwS257S0000000_19, null, null, new AwS550S0100000_6((C03K6) unreachableExpendCell, 1588));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = UnreachableExpendCell.LLJ;
            assemVMLazy.getValue().setState(new AwS580S0100000_1(new C031E(!r2.LL, ((C031E) ajS43S0200000_19.l1).LLILLJJLI), 406));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS43S0200000_19(StoryMixedFeedDetailPanel storyMixedFeedDetailPanel, TuxTextView tuxTextView, int i) {
        super(1700L);
        this.$t = i;
        this.l0 = storyMixedFeedDetailPanel;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS43S0200000_19(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
