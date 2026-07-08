package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.InterfaceC494301wD;
import X.InterfaceC594520NTm;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchServiceCenter$CardCommonAbility extends InterfaceC494301wD {
    void A12(View.OnAttachStateChangeListener onAttachStateChangeListener);

    boolean Qa0(InterfaceC665370Q7z interfaceC665370Q7z);

    InterfaceC594520NTm cB2();

    ISearchCardProtocol<InterfaceC594520NTm> getProtocol();

    RecyclerView.ViewHolder k4();
}
