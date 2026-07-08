package com.ss.android.ugc.aweme.mix.choose;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C1158260gFM;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C20607315kN;
import X.C2217381BqS;
import X.C613200O3i;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C739760T0c;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS327S0000000_2;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistChoosePanelListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistChoosePanelListAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/mix/choose/PlaylistChoosePanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaylistChoosePanelListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistChoosePanelViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 414), AFwS256S0000000_18.get$arr$(135), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1158260gFM.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dwv;
    }

    public final PlaylistChoosePanelViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (PlaylistChoosePanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCreateMixListSuccess(C739760T0c c739760T0c) {
        if (c739760T0c.LIZ) {
            if (!TextUtils.isEmpty(c739760T0c.LIZJ) && !TextUtils.isEmpty(c739760T0c.LIZIZ)) {
                hp().AQ2(c739760T0c.LIZJ, 0, c739760T0c.LIZIZ, true, true);
                hp().LLILLJJLI.getClass();
                ((LruCache) C613200O3i.LL.getValue().LIZLLL.getValue()).evictAll();
            }
            if (!((C1158260gFM) this.LLJJIII.getValue()).LLILLL) {
                hp().refresh();
                Integer numXQ2 = hp().xQ2();
                if (numXQ2 != null) {
                    int iIntValue = numXQ2.intValue();
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJIIIZ(iIntValue);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                hp().vQ2(c739760T0c.LIZJ, c739760T0c.LIZIZ, "create");
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.onViewCreated(view);
        if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PlaylistChoosePanelListCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) hp().LLILZIL.getValue());
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.LJII(new C20607315kN() { // from class: X.0gVz
                @Override // X.C20607315kN
                public final void LJI(boolean z) {
                    if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) >= (viewOnAttachStateChangeListenerC20604515jv.getHeight() - viewOnAttachStateChangeListenerC20604515jv.getPaddingTop()) - viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom()) {
                        this.LL.hp().setState(new AwS32S0010000_18(25));
                    }
                }

                @Override // X.C20607315kN
                public final void LJII(Exception exc) {
                    boolean zLIZLLL;
                    Context context = this.LL.getContext();
                    if (context != null) {
                        zLIZLLL = C0XF1.LIZLLL(context);
                    } else {
                        zLIZLLL = true;
                    }
                    if (C298190BmT.LIZ() && !zLIZLLL) {
                        this.LL.hp().setState(new AwS69S1000000_18("Network Error", 29));
                    } else {
                        this.LL.hp().setState(new AwS69S1000000_18("Something Went Wrong", 29));
                    }
                }

                @Override // X.C20607315kN
                public final void LJIIIZ(boolean z) {
                    this.LL.hp().setState(new AwS69S1000000_18("Dismiss", 29));
                    if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() == 0) {
                        this.LL.hp().setState(new AwS69S1000000_18("Empty List", 29));
                    }
                    if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) >= (viewOnAttachStateChangeListenerC20604515jv.getHeight() - viewOnAttachStateChangeListenerC20604515jv.getPaddingTop()) - viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom()) {
                        this.LL.hp().setState(new AwS32S0010000_18(25));
                    }
                    viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0gW0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1168510gVt) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 43), 4);
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0gW1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1168510gVt) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0gW3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1168510gVt) obj).LLIZ;
            }
        }, null, AFwS327S0000000_2.get$arr$(0), 12);
        hp().refresh();
    }
}
