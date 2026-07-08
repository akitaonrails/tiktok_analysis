package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.desc.ui;

import X.C0PEM;
import X.C10EU;
import X.C1908030zkf;
import X.C23250099c;
import X.C337180DJs;
import X.C427870Gq9;
import X.C434460H1w;
import X.EnumC657270PqH;
import X.InterfaceC657240PqE;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaUserDescAssem extends BaseSearchMediaOptionalAssem {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C427870Gq9 LLJL;
    public TuxIconView LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu7;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.u8o);
        this.LLJL = (C427870Gq9) view.findViewById(R.id.u8n);
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.u8p);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean sp(List list) {
        if (!list.isEmpty() && !list.contains(EnumC657270PqH.DESC_STYLE) && !list.contains(EnumC657270PqH.AUTHOR_AREA)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        String nickname;
        String customVerify;
        String enterpriseVerifyReason;
        super.up(interfaceC657240PqE);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C434460H1w(interfaceC657240PqE, this, null), 2);
        User author = interfaceC657240PqE.getAweme().getAuthor();
        if (author != null) {
            if (C10EU.LJIJ(author)) {
                nickname = author.getUniqueId();
            } else {
                nickname = author.getNickname();
            }
        } else {
            nickname = null;
        }
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(nickname);
        }
        Integer numLJJII = interfaceC657240PqE.LJJII();
        if (numLJJII != null) {
            int iIntValue = numLJJII.intValue();
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(iIntValue);
            }
        }
        if (author != null) {
            customVerify = author.getCustomVerify();
            enterpriseVerifyReason = author.getEnterpriseVerifyReason();
        } else {
            customVerify = null;
            enterpriseVerifyReason = null;
        }
        if (C1908030zkf.LIZLLL(new UserVerify(null, customVerify, enterpriseVerifyReason, -1))) {
            C337180DJs.LIZJ(this.LLJLIL);
        } else {
            C337180DJs.LIZ(this.LLJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        return interfaceC657240PqE.LJJIIZI().getItemVisibility().LIZ;
    }
}
