package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C01GW;
import X.C1017070cZd;
import X.C452501pT;
import X.C693790RJh;
import X.EnumC696280RSw;
import X.InterfaceC1008930cMV;
import X.InterfaceC1014340cVE;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent;
import com.ss.android.ugc.aweme.api.component.anole.full.AnoleBetweenLRInteractAssem;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleBetweenLRInteractAssem extends CommerceBaseSlotComponent {
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 55));

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    public final int Ip() {
        return R.id.ym2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b58;
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    public final String Gp() {
        return EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE.getSlotName();
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IAnoleManager iAnoleManagerRi;
        super.unBind();
        InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
        if (interfaceC1008930cMVFp == null || (iAnoleManagerRi = interfaceC1008930cMVFp.Ri()) == null) {
            return;
        }
        iAnoleManagerRi.LJIIJJI(EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE_3D_FOREGROUND.getSlotName());
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    /* JADX INFO: renamed from: Jp */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC1008930cMV interfaceC1008930cMVFp;
        IAnoleManager iAnoleManagerRi;
        super.up(videoItemParams);
        if (C1017070cZd.LJJJLL(videoItemParams.getAweme())) {
            List<String> listLIZ = C693790RJh.LIZ(videoItemParams.getAweme());
            EnumC696280RSw enumC696280RSw = EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE_3D_FOREGROUND;
            if (listLIZ.contains(enumC696280RSw.getSlotName()) && (LJJIJL() instanceof ViewGroup) && (interfaceC1008930cMVFp = Fp()) != null && (iAnoleManagerRi = interfaceC1008930cMVFp.Ri()) != null) {
                iAnoleManagerRi.mount((ViewGroup) LJJIJL(), enumC696280RSw.getSlotName(), new InterfaceC1014340cVE() { // from class: X.0REi
                    @Override // X.InterfaceC1014340cVE
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LIZLLL(boolean z) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJFF(boolean z) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJJJIL() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                        AnoleBetweenLRInteractAssem anoleBetweenLRInteractAssem = this.LIZ;
                        anoleBetweenLRInteractAssem.getClass();
                        anoleBetweenLRInteractAssem.sQ(EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE_3D_FOREGROUND.getSlotName(), str, view, anoleComponentLayoutModel);
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                        this.LIZ.getClass();
                        if (!Intrinsics.LJFF(str, EnumC696280RSw.TT_FEED_BETWEEN_LEFT_RIGHT_INTERACTIVE_3D_FOREGROUND.getSlotName())) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("changeContainerLayout slotID = ");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        View viewLJJIJL = this.LIZ.LJJIJL();
                        ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (num != null) {
                                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue()))));
                            }
                            if (num2 != null) {
                                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue()))));
                            }
                            if (num3 != null) {
                                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3.intValue())));
                            }
                            if (num4 != null) {
                                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num4.intValue())));
                            }
                            C786410Ut5.W5(viewLJJIJL, marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent
    public final void sQ(String str, String str2, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
        CommerceInteractionAbility commerceInteractionAbility = (CommerceInteractionAbility) this.LLLF.getValue();
        if (commerceInteractionAbility != null) {
            commerceInteractionAbility.sQ(str, str2, view, anoleComponentLayoutModel);
        }
    }
}
