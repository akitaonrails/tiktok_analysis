package com.ss.android.ugc.aweme.api.component.longpress;

import X.C01GW;
import X.C0SUL;
import X.C1017180cZo;
import X.C452501pT;
import X.InterfaceC690460R6m;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes12.dex */
public final class ADMutantCardLongPressComponent extends BaseCellContentComponent<ADMutantCardLongPressComponent> {
    public Aweme LLJJJJLIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 62));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        CardInsertInfo cardInsertInfo = videoItemParams.getAweme().getCardInsertInfo();
        if ((cardInsertInfo != null && cardInsertInfo.getCardType() == 13) || C1017180cZo.LJIL(videoItemParams.getAweme().getAwemeRawAd())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C0SUL c0sul;
        if ((view instanceof C0SUL) && (c0sul = (C0SUL) view) != null) {
            c0sul.setListener(new InterfaceC690460R6m() { // from class: X.0RTv
                @Override // X.InterfaceC690460R6m
                public final void LIZ(float f, float f2) {
                    FragmentManager supportFragmentManager;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        ((DialogFragment) this.LIZ.LLJJL.getValue()).show(supportFragmentManager, "ad_mutant_card_long_press");
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        this.LLJJJJLIIL = videoItemParams.getAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
