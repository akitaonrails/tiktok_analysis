package com.ss.android.ugc.aweme.commercialize.challenge.service;

import X.C1025200cmk;
import X.C19421310yZ;
import X.InterfaceC1631620sYq;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableString;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public interface ICommerceChallengeService {
    C19421310yZ LIZ();

    void LIZIZ(String str, String str2);

    void LIZJ();

    void LIZLLL(int i);

    void LJ(Challenge challenge);

    LinkedHashMap<String, Bitmap> LJI();

    void LJII(String str, String str2);

    void LJIIIIZZ(Uri uri, String str);

    void LJIIIZ(String str, String str2);

    boolean LJIIJ(String str, boolean z, TextView textView, boolean z2, String str2);

    void LJIIJJI(int i, Aweme aweme, String str, InterfaceC1631620sYq<? super Integer, ? super Integer, Object, Unit> interfaceC1631620sYq);

    UrlModel LJIIL(String str, boolean z, boolean z2);

    void LJIILIIL();

    void LJIILJJIL(C1025200cmk c1025200cmk);

    void LJIILL(TextView textView, Aweme aweme, SpannableString spannableString);

    void LJIILLIIL(TextExtraStruct textExtraStruct);

    boolean LJIIZILJ(String str);

    boolean LJIJ(Challenge challenge);

    boolean LJIJI(String str, UrlModel urlModel, SpannableString spannableString, TextView textView, String str2);

    boolean LJIJJ(Challenge challenge);

    Aweme LJIJJLI(Aweme aweme);

    void LJIL(String str);
}
