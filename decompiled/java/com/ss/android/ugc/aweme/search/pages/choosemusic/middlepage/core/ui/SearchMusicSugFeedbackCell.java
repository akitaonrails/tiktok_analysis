package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681930Qox;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchMusicSugFeedbackCell extends PowerCell<C681930Qox> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.hwi), new View.OnClickListener() { // from class: X.064M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1440005kM.LIZ(new IEvent() { // from class: X.064N
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eys, viewGroup, false);
    }
}
