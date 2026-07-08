package com.ss.android.ugc.aweme.emojisticker.api;

import X.C1895007bY;
import X.InterfaceC19599811mG;
import X.InterfaceC19599911mH;
import X.InterfaceC19670311xd;
import X.InterfaceC730350Skr;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public interface IEmojiStickerAbilityProvider {
    InterfaceC19670311xd LIZ(ViewGroup viewGroup, Context context, Function1<? super SocialEmoji, Unit> function1);

    InterfaceC730350Skr LIZIZ(C1895007bY c1895007bY);

    InterfaceC730350Skr LIZJ(C1895007bY c1895007bY);

    InterfaceC19599811mG LIZLLL(Context context, C1895007bY c1895007bY, DialogInterface.OnDismissListener onDismissListener);

    InterfaceC19599911mH LJ(Context context, InteractStickerStruct interactStickerStruct, C1895007bY c1895007bY);
}
