package com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service;

import X.C1891750zKP;
import X.C1891820zKW;
import X.C1891870zKb;
import X.C1891990zKn;
import X.C1895007bY;
import X.C437880HFa;
import X.InterfaceC19599811mG;
import X.InterfaceC19599911mH;
import X.InterfaceC19670311xd;
import X.InterfaceC730350Skr;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public final class EmojiStickerAbilityProviderImpl implements IEmojiStickerAbilityProvider {
    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC730350Skr LIZIZ(C1895007bY c1895007bY) {
        return new C1891870zKb(c1895007bY);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC730350Skr LIZJ(C1895007bY c1895007bY) {
        return new C1891820zKW(c1895007bY);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19670311xd LIZ(ViewGroup viewGroup, Context context, Function1<? super SocialEmoji, Unit> function1) {
        return new C1891990zKn(viewGroup, context, function1);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19599811mG LIZLLL(Context context, C1895007bY c1895007bY, DialogInterface.OnDismissListener onDismissListener) {
        return new C1891750zKP(context, c1895007bY, onDismissListener, 1);
    }

    @Override // com.ss.android.ugc.aweme.emojisticker.api.IEmojiStickerAbilityProvider
    public final InterfaceC19599911mH LJ(Context context, InteractStickerStruct interactStickerStruct, C1895007bY c1895007bY) {
        return new C437880HFa(context, interactStickerStruct, c1895007bY);
    }
}
