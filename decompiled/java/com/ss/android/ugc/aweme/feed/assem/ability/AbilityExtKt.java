package com.ss.android.ugc.aweme.feed.assem.ability;

import X.C0QSJ;
import X.C1387230mCf;
import X.C1558520qew;
import X.C20556915cF;
import X.C296200BjG;
import X.C687700QyG;
import X.C690990R8n;
import X.InterfaceC1058490deR;
import X.InterfaceC1294060jmO;
import X.InterfaceC20561815d2;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;

/* JADX INFO: loaded from: classes12.dex */
public final class AbilityExtKt {
    public static final /* synthetic */ int LIZ = 0;

    public static final CellAdaptionComponentAbility LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) C1558520qew.LIZ(interfaceC665370Q7z, CellAdaptionComponentAbility.class, null);
        if (cellAdaptionComponentAbility == null) {
            return new CellAdaptionComponentAbility() { // from class: com.ss.android.ugc.aweme.feed.assem.ability.AbilityExtKt$getAdaptionAbility$1
                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                @InterfaceC1294060jmO
                public final void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup) {
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final boolean DP1() {
                    return false;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                @InterfaceC1294060jmO
                public final void FH1(Context context, Aweme aweme, View view, OcrLocation ocrLocation, ViewGroup viewGroup) {
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                @InterfaceC1294060jmO
                public final void M72(Context context, View view, Integer num, Integer num2, ViewGroup viewGroup, Aweme aweme) {
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final AdaptionPaddingValues Ns0() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final int Sj0() {
                    return 0;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final boolean XG1() {
                    return false;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final void XX0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2) {
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final boolean YP0() {
                    return false;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final boolean ZY1(boolean z) {
                    return false;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final void aW0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2, boolean z) {
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final InterfaceC1058490deR dj2() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final boolean fk1() {
                    return false;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final View jj1() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final AdaptionPaddingValues n81() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final C1387230mCf tK1() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final AdaptionPaddingValues vk1() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final VideoAdaptionResult wB2() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final VideoAdaptionResult yc2() {
                    return null;
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                public final void Ct2(String str, Integer num, Integer num2, View... viewArr) {
                    C20556915cF.LIZ(str, num, num2, viewArr);
                }

                @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
                @InterfaceC1294060jmO
                public final C690990R8n FF0(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup) {
                    return new C690990R8n(0, 0);
                }
            };
        }
        return cellAdaptionComponentAbility;
    }

    public static final HomeTabAbility LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        Object ability;
        Object obj = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeTabAbility) {
                obj = ability;
            }
            return (HomeTabAbility) obj;
        }
        return (HomeTabAbility) C1558520qew.LIZ(interfaceC665370Q7z, HomeTabAbility.class, null);
    }
}
