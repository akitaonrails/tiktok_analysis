package com.ss.android.ugc.aweme.tako.botpage.cards.answer.videogeneration;

import X.C1558420qem;
import X.C1558520qew;
import X.C1857020yQO;
import X.InterfaceC1783650wW3;
import X.InterfaceC1855990yOj;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseCell;
import com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoCardAutoPlayAbility;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerVideoGenerationCell extends TakoBaseCell<TakoAnswerVideoGenerationAssem, C1857020yQO> implements InterfaceC1855990yOj {
    @Override // X.InterfaceC1855990yOj
    public final RecyclerView.ViewHolder k4() {
        return this;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new TakoAnswerVideoGenerationAssem();
    }

    @Override // X.InterfaceC1855990yOj
    public final View L4() {
        InterfaceC1783650wW3 interfaceC1783650wW3Af;
        View detectView;
        TakoCardAutoPlayAbility takoCardAutoPlayAbility = (TakoCardAutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), TakoCardAutoPlayAbility.class, null);
        return (takoCardAutoPlayAbility == null || (interfaceC1783650wW3Af = takoCardAutoPlayAbility.af()) == null || (detectView = interfaceC1783650wW3Af.getDetectView()) == null) ? this.itemView : detectView;
    }

    @Override // X.InterfaceC1855990yOj
    public final InterfaceC1783650wW3 af() {
        TakoCardAutoPlayAbility takoCardAutoPlayAbility = (TakoCardAutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), TakoCardAutoPlayAbility.class, null);
        if (takoCardAutoPlayAbility != null) {
            return takoCardAutoPlayAbility.af();
        }
        return null;
    }

    @Override // X.InterfaceC1855990yOj
    public final int gl() {
        return getBindingAdapterPosition();
    }
}
