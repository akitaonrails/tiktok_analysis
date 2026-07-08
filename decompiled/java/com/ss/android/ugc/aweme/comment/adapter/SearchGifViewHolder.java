package com.ss.android.ugc.aweme.comment.adapter;

import X.C10E7;
import X.C11EA;
import X.C2188811AlT;
import X.InterfaceC1322530kWJ;
import X.InterfaceC1766500w4O;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchGifViewHolder extends JediBaseViewHolder<SearchGifViewHolder, GifEmoji> implements InterfaceC1322530kWJ {
    @Override // X.InterfaceC1322530kWJ
    public final void onFail() {
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1322530kWJ
    public final void onSuccess() {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(this, 66);
        JediViewHolderProxy jediViewHolderProxy = this.LLILZLL;
        if (jediViewHolderProxy == null) {
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }
        C10E7 c10e7 = new C10E7(this.LLJ, jediViewHolderProxy.LLILZ.getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(SearchGifViewHolder.class.getName());
        sbLIZ.append('_');
        sbLIZ.append(GifEmojiViewModel.class.getName());
        JediViewModel jediViewModel = (JediViewModel) c10e7.LIZ(C2188811AlT.LIZIZ(sbLIZ), GifEmojiViewModel.class);
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(GifEmojiViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(awS613S0100000_34);
        C11EA.LJIIL(this, jediViewModel, AFwS323S0000000_34.get$arr$(0));
    }
}
