package kotlin.jvm.internal;

import X.AbstractC20660815t0;
import X.AbstractC724260Sb2;
import X.AbstractC738410Sxr;
import X.C09AY;
import X.C0RTL;
import X.C1243000iS2;
import X.C1668306g5;
import X.C724270Sb3;
import X.EnumC717440SCg;
import X.InterfaceC20660615sy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.storyreveal.StoryRevealInboxPopupTriggerImpl;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AwS6S0400100_11 extends C09AY implements Function0 {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0400100_11 awS6S0400100_11) {
        AbstractC738410Sxr abstractC738410SxrLIZ;
        AssemSupervisor assemSupervisor = (AssemSupervisor) awS6S0400100_11.l0;
        ReusedAssem reusedAssem = (ReusedAssem) awS6S0400100_11.l1;
        C0RTL c0rtl = (C0RTL) awS6S0400100_11.l2;
        if (c0rtl != null) {
            abstractC738410SxrLIZ = c0rtl.LIZ();
        } else {
            abstractC738410SxrLIZ = null;
        }
        if (assemSupervisor.LJII(reusedAssem, abstractC738410SxrLIZ)) {
            AbstractC724260Sb2 abstractC724260Sb2 = (AbstractC724260Sb2) awS6S0400100_11.l3;
            if (abstractC724260Sb2 != null) {
                abstractC724260Sb2.LIZLLL((ReusedAssem) awS6S0400100_11.l1, awS6S0400100_11.j4);
            }
            ((AssemSupervisor) awS6S0400100_11.l0).LIZIZ((ReusedAssem) awS6S0400100_11.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0400100_11 awS6S0400100_11) {
        Fragment fragment = (Fragment) awS6S0400100_11.l0;
        if (fragment != null && fragment.isAdded() && ((Fragment) awS6S0400100_11.l0).getView() != null) {
            final InterfaceC20660615sy interfaceC20660615sy = (InterfaceC20660615sy) awS6S0400100_11.l1;
            final EnumC717440SCg enumC717440SCg = (EnumC717440SCg) awS6S0400100_11.l2;
            PopupManager.LJIIZILJ(new AbstractC20660815t0(interfaceC20660615sy, enumC717440SCg) { // from class: X.0SA1
                public final String LL = "notification_page";
                public final EnumC717440SCg LLILLJJLI;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 5;
                }

                {
                    this.LLILLJJLI = enumC717440SCg;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                    Boolean boolValueOf = null;
                    if ((c19egLIZIZ instanceof C19EG) && c19egLIZIZ != null) {
                        IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
                        if (iStoryRevealService != null) {
                            String str = this.LL;
                            if (str == null) {
                                str = "notification_page";
                            }
                            boolValueOf = Boolean.valueOf(iStoryRevealService.LIZ(c19egLIZIZ, str, this.LLILLJJLI, new AwS555S0100000_11(c20656615sK, 1347)));
                        }
                        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                            c20656615sK.LIZ();
                            return;
                        }
                        return;
                    }
                    c20656615sK.LIZ();
                }
            }, new C1668306g5("social_story_reveal_inbox_phase_out"));
            ((StoryRevealInboxPopupTriggerImpl) awS6S0400100_11.l3).LIZIZ = awS6S0400100_11.j4;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S0400100_11 awS6S0400100_11) {
        Fragment fragment = (Fragment) awS6S0400100_11.l0;
        if (fragment != null && fragment.isAdded() && ((Fragment) awS6S0400100_11.l0).getView() != null) {
            PopupManager.LJIJI(new C1243000iS2((InterfaceC20660615sy) awS6S0400100_11.l1, (Context) awS6S0400100_11.l2, (Fragment) awS6S0400100_11.l0), true);
            ((StoryRevealInboxPopupTriggerImpl) awS6S0400100_11.l3).LIZIZ = awS6S0400100_11.j4;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0400100_11(long j, AssemSupervisor assemSupervisor, C0RTL c0rtl, C724270Sb3 c724270Sb3, ReusedAssem reusedAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = assemSupervisor;
        this.l1 = reusedAssem;
        this.l2 = c0rtl;
        this.l3 = c724270Sb3;
        this.j4 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0400100_11(Fragment fragment, InterfaceC20660615sy interfaceC20660615sy, EnumC717440SCg enumC717440SCg, StoryRevealInboxPopupTriggerImpl storyRevealInboxPopupTriggerImpl, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = interfaceC20660615sy;
        this.l2 = enumC717440SCg;
        this.l3 = storyRevealInboxPopupTriggerImpl;
        this.j4 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0400100_11(Fragment fragment, InterfaceC20660615sy interfaceC20660615sy, Context context, StoryRevealInboxPopupTriggerImpl storyRevealInboxPopupTriggerImpl, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = interfaceC20660615sy;
        this.l2 = context;
        this.l3 = storyRevealInboxPopupTriggerImpl;
        this.j4 = j;
    }
}
