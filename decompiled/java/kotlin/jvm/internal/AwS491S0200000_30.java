package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AbstractC2238408pq;
import X.C07G1;
import X.C09AY;
import X.C0PEM;
import X.C1390920mIc;
import X.C14TF;
import X.C14XH;
import X.C19EG;
import X.C1DFH;
import X.C20228914Df;
import X.C2107308Nj;
import X.C23250099c;
import X.C2441609hW;
import X.C298790BnR;
import X.C299110Bnx;
import X.C324950CoX;
import X.C520040KaQ;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC20307414d6;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC20228814De;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoIgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TuxTakoIgnoreRecyclerAndPagerSheetBehaviour;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS491S0200000_30 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS491S0200000_30(C19EG c19eg, TakoEnterParams takoEnterParams, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoEnterParams;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS491S0200000_30(Context context, DisplayAndCaptionVM displayAndCaptionVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = displayAndCaptionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS491S0200000_30(TakoAssem takoAssem, VideoItemParams videoItemParams, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoAssem;
        this.l1 = videoItemParams;
    }

    public static final Object invoke$0(AwS491S0200000_30 awS491S0200000_30, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C14XH.LIZLLL((Context) awS491S0200000_30.l0, (DisplayAndCaptionVM) awS491S0200000_30.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS491S0200000_30 awS491S0200000_30, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C14XH.LJIIJ((Context) awS491S0200000_30.l0, (DisplayAndCaptionVM) awS491S0200000_30.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS491S0200000_30 awS491S0200000_30, Object obj, Object obj2, Object obj3) {
        Function1<Boolean, Unit> function1;
        InterfaceC20228814De interfaceC20228814De;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        String str = (String) obj3;
        C20228914Df c20228914Df = TakoSheetFragment.LLLLLZ;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS491S0200000_30.l0;
        c20228914Df.getClass();
        TakoSheetFragment takoSheetFragment = new TakoSheetFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "tako_enter_param", takoEnterParams);
        takoSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = takoSheetFragment;
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LJI(48);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = false;
        tuxSheet.LLJLILLLLZIIL = false;
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = new TuxTakoIgnoreRecyclerAndPagerSheetBehaviour();
        } else {
            c1390920mIc.LIZ.LLLIIII = new TakoIgnoreRecyclerAndPagerBottomSheetBehaviour();
        }
        DialogInterfaceOnDismissListenerC20307414d6 dialogInterfaceOnDismissListenerC20307414d6 = new DialogInterfaceOnDismissListenerC20307414d6((TakoEnterParams) awS491S0200000_30.l0, takoSheetFragment, 1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC20307414d6;
        FragmentManager supportFragmentManager = ((C19EG) awS491S0200000_30.l1).getSupportFragmentManager();
        TakoEnterParams takoEnterParams2 = (TakoEnterParams) awS491S0200000_30.l0;
        tuxSheet2.show(supportFragmentManager, "TakoSheetFragment");
        TakoChatContainerData takoChatContainerData = takoEnterParams2.chatContainerData;
        if (takoChatContainerData != null && (interfaceC20228814De = takoChatContainerData.sheetCallback) != null) {
            interfaceC20228814De.onShow();
        } else {
            SmartSearchItem smartSearchItem = takoEnterParams2.smartSearchInfo;
            if (smartSearchItem != null && (function1 = smartSearchItem.onSheetCallback) != null) {
                function1.invoke(Boolean.TRUE);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) awS491S0200000_30.l1), C0PEM.LIZJ, null, new C324950CoX((TakoEnterParams) awS491S0200000_30.l0, jLongValue, zBooleanValue, str, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS491S0200000_30 awS491S0200000_30, Object obj, Object obj2, Object obj3) {
        boolean z;
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwnerLJFF;
        AbstractC2238408pq abstractC2238408pqLLIILII;
        SmartImageView smartImageView = (SmartImageView) obj;
        ImageView imageView = (ImageView) obj2;
        View view = (View) obj3;
        TakoAssem takoAssem = (TakoAssem) awS491S0200000_30.l0;
        VideoItemParams videoItemParams = (VideoItemParams) awS491S0200000_30.l1;
        if (!takoAssem.LLLF || ((C298790BnR.LIZ() & 2) == 0 && !C14TF.LIZIZ.LJIILL().LJFF(videoItemParams.getAweme()))) {
            if (Intrinsics.LJFF(takoAssem.LLLFZ, Boolean.TRUE)) {
                if (takoAssem.Tp(videoItemParams)) {
                    takoAssem.LLLF = true;
                    takoAssem.Gp(smartImageView, imageView, view);
                } else {
                    takoAssem.LLLF = false;
                    takoAssem.Bp(false);
                }
            } else {
                if ((C07G1.LIZ() & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || takoAssem.LLL == null) {
                    AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(takoAssem.LJJIJL());
                    if (abstractC1387200mCcLIZ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) != null) {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJFF);
                    } else {
                        lifecycleScope = null;
                    }
                    takoAssem.LLL = lifecycleScope;
                }
                InterfaceC497601wk interfaceC497601wk = takoAssem.LLL;
                if (interfaceC497601wk != null) {
                    if ((C298790BnR.LIZ() & 8) != 0) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                    } else {
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        abstractC2238408pqLLIILII = C2107308Nj.LIZ;
                    }
                    C23250099c.LIZLLL(interfaceC497601wk, abstractC2238408pqLLIILII, null, new C2441609hW(takoAssem, videoItemParams, smartImageView, imageView, view, null), 2);
                }
            }
        }
        return Unit.LIZ;
    }
}
