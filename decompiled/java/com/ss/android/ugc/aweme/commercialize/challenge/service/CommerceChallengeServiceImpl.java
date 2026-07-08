package com.ss.android.ugc.aweme.commercialize.challenge.service;

import X.AbstractC468201s0;
import X.C04PR;
import X.C1025200cmk;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C19421310yZ;
import X.C19421710yd;
import X.C19422110yh;
import X.C1AF0;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C438710HIf;
import X.InterfaceC1631620sYq;
import X.InterfaceC447230HgH;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.model.Hashtag2Emoji;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceLockStickerServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class CommerceChallengeServiceImpl implements ICommerceChallengeService {
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final LinkedHashMap<String, Bitmap> LJI() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_edit_hashtag_with_emoji", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return zLIZ ? C19421710yd.LJ : new LinkedHashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final C19421310yZ LIZ() {
        return new C19421310yZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LIZJ() {
        C19421710yd.LJ.clear();
        C19421710yd.LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIILIIL() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LIZLLL(final int i) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        UrlModel urlModel;
        Long l;
        Long l2;
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("enable_edit_hashtag_with_emoji", true)) {
                C19421710yd.LJ.clear();
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (!C19421710yd.LIZLLL) {
            C19421710yd.LIZLLL = true;
            C19421710yd.LIZ();
            C19421710yd.LJ.clear();
            for (final String str : C19421710yd.LIZIZ.keySet()) {
                Hashtag2Emoji hashtag2Emoji = C19421710yd.LIZIZ.get(str);
                if (hashtag2Emoji != null && (l2 = hashtag2Emoji.startTime) != null) {
                    jCurrentTimeMillis = l2.longValue();
                } else {
                    jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1;
                }
                Hashtag2Emoji hashtag2Emoji2 = C19421710yd.LIZIZ.get(str);
                if (hashtag2Emoji2 != null && (l = hashtag2Emoji2.expireTime) != null) {
                    jCurrentTimeMillis2 = l.longValue();
                } else {
                    jCurrentTimeMillis2 = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - 1;
                }
                long j = jCurrentTimeMillis + 1;
                long jCurrentTimeMillis3 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (j <= jCurrentTimeMillis3 && jCurrentTimeMillis3 < jCurrentTimeMillis2) {
                    Hashtag2Emoji hashtag2Emoji3 = C19421710yd.LIZIZ.get(str);
                    if (hashtag2Emoji3 != null) {
                        urlModel = hashtag2Emoji3.urlModel;
                    } else {
                        urlModel = null;
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LIZLLL("hashtagemoji");
                    c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.10yg
                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th2) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap == null) {
                                return;
                            }
                            LinkedHashMap<String, Bitmap> linkedHashMap = C19421710yd.LJ;
                            String str2 = str;
                            C19421710yd c19421710yd = C19421710yd.LIZ;
                            int i2 = i;
                            c19421710yd.getClass();
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Matrix matrix = new Matrix();
                            matrix.postScale(i2 / width, i2 / height);
                            linkedHashMap.put(str2, Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJ(Challenge challenge) {
        int readHoldCount;
        int i = 0;
        if (challenge != null && C19422110yh.LIZ(challenge)) {
            ReentrantReadWriteLock reentrantReadWriteLock = C19422110yh.LIZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C19422110yh.LIZLLL(challenge.getCid());
                C19422110yh.LIZLLL(challenge.getChallengeName());
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIILJJIL(C1025200cmk c1025200cmk) {
        C04PR.LIZ.LIZIZ(c1025200cmk);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIILLIIL(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            C19422110yh.LIZIZ(textExtraStruct.getCid());
            C19422110yh.LIZIZ(textExtraStruct.getHashTagName());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIIZILJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ReentrantReadWriteLock.ReadLock lock = C19422110yh.LIZ.readLock();
        lock.lock();
        try {
            boolean zContains = C19422110yh.LIZIZ.contains(str);
            lock.unlock();
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIJ(Challenge challenge) {
        if (challenge != null) {
            try {
                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) new Gson().LJIIIIZZ(challenge.getChallengeStickerDetail(), new TypeToken<NewFaceStickerBean>() { // from class: X.10w2
                }.getType());
                if (newFaceStickerBean != null) {
                    return CommerceLockStickerServiceImpl.LIZJ().LIZ(newFaceStickerBean);
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIJJ(Challenge challenge) {
        if (challenge != null && C19422110yh.LIZ(challenge)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final Aweme LJIJJLI(Aweme aweme) {
        if (aweme != null && aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
            StringBuffer stringBuffer = new StringBuffer(aweme.getDesc());
            ArrayList arrayList = new ArrayList();
            ArrayList<TextExtraStruct> arrayList2 = new ArrayList();
            arrayList2.addAll(aweme.getTextExtra());
            Collections.sort(arrayList2, new Comparator<TextExtraStruct>() { // from class: X.0Xtt
                @Override // java.util.Comparator
                public final int compare(TextExtraStruct textExtraStruct, TextExtraStruct textExtraStruct2) {
                    TextExtraStruct textExtraStruct3 = textExtraStruct;
                    TextExtraStruct textExtraStruct4 = textExtraStruct2;
                    if (textExtraStruct3 != null && textExtraStruct4 != null && textExtraStruct3.getStart() != textExtraStruct4.getStart()) {
                        if (textExtraStruct3.getStart() < textExtraStruct4.getStart()) {
                            return -1;
                        }
                        return 1;
                    }
                    return 0;
                }
            });
            int i = 0;
            for (TextExtraStruct textExtraStruct : arrayList2) {
                if (i != 0) {
                    textExtraStruct.setStart(textExtraStruct.getStart() + i);
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + i);
                }
                if (textExtraStruct.getType() == 1 && C19421710yd.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null && textExtraStruct.getHashTagName().length() == (textExtraStruct.getEnd() - textExtraStruct.getStart()) - 1 && stringBuffer.length() >= textExtraStruct.getEnd()) {
                    stringBuffer.insert(textExtraStruct.getEnd(), C20642515q3.LJI(2131848665));
                    textExtraStruct.setEnd(textExtraStruct.getEnd() + 1);
                    i++;
                }
                arrayList.add(textExtraStruct);
            }
            if (i != 0) {
                aweme.setDesc(stringBuffer.toString());
                aweme.setTextExtra(arrayList);
            }
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIL(String str) {
        C19422110yh.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LIZIZ(String str, String str2) {
        C19421710yd.LIZ.getClass();
        if (str2 != null && str2.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tag_name", str2.toLowerCase(Locale.ROOT));
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("click_commercial_emoji", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJII(String str, String str2) {
        Uri uri;
        if (str != null && (uri = UriProtector.parse(str)) != null) {
            C19422110yh.LIZJ(uri, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIIIZZ(Uri uri, String str) {
        C19422110yh.LIZJ(uri, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIIZ(String str, String str2) {
        C19421710yd.LIZ.getClass();
        C19421710yd.LIZLLL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final UrlModel LJIIL(String str, boolean z, boolean z2) {
        return C19421710yd.LIZIZ(str, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIILL(final TextView textView, Aweme aweme, SpannableString spannableString) {
        UrlModel urlModelLIZIZ;
        if (aweme != null) {
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = spannableString;
            if (aweme.getTextExtra() != null && !TextUtils.isEmpty(spannableString)) {
                for (final TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    if (textExtraStruct.getType() == 1) {
                        C19421710yd c19421710yd = C19421710yd.LIZ;
                        String desc = aweme.getDesc();
                        c19421710yd.getClass();
                        if (C19421710yd.LIZJ(textExtraStruct, desc) && (urlModelLIZIZ = C19421710yd.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(urlModelLIZIZ);
                            c1331670kl3LJIIIIZZ.LIZLLL("hashtagemoji");
                            c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.10yW
                                public final /* synthetic */ String LLILZ = "search_hashtag";

                                @Override // X.InterfaceC1331910klR
                                public final void onFailed(Throwable th) {
                                }

                                /* JADX WARN: Type inference failed for: r3v2, types: [T, android.text.SpannableString] */
                                @Override // X.InterfaceC1331910klR
                                public final void LIZ(Bitmap bitmap) {
                                    if (bitmap == null) {
                                        return;
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                                    bitmapDrawable.setBounds(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
                                    C416750GVt c416750GVt = new C416750GVt(bitmapDrawable);
                                    C259800zU<SpannableString> c259800zU2 = c259800zU;
                                    C19421710yd c19421710yd2 = C19421710yd.LIZ;
                                    SpannableString spannableString2 = c259800zU2.element;
                                    int end = textExtraStruct.getEnd();
                                    int end2 = textExtraStruct.getEnd() + 1;
                                    c19421710yd2.getClass();
                                    int length = spannableString2.length();
                                    if (end <= length && end2 <= length && end <= end2) {
                                        C786410Ut5.p2(spannableString2, c416750GVt, end, end2, 33);
                                    }
                                    c259800zU2.element = spannableString2;
                                    textView.setText(c259800zU.element);
                                    C19421710yd.LIZLLL(this.LLILZ, textExtraStruct.getHashTagName());
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final void LJIIJJI(final int i, Aweme aweme, final String str, final InterfaceC1631620sYq<? super Integer, ? super Integer, Object, Unit> interfaceC1631620sYq) {
        UrlModel urlModelLIZIZ;
        if (aweme != null && aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
            ArrayList<TextExtraStruct> arrayList = new ArrayList();
            arrayList.addAll(aweme.getTextExtra());
            for (final TextExtraStruct textExtraStruct : arrayList) {
                if (textExtraStruct.getType() == 1) {
                    C19421710yd c19421710yd = C19421710yd.LIZ;
                    String desc = aweme.getDesc();
                    c19421710yd.getClass();
                    if (C19421710yd.LIZJ(textExtraStruct, desc) && (urlModelLIZIZ = C19421710yd.LIZIZ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                        C1324840ka2.LJIJ(urlModelLIZIZ, i, i, new InterfaceC447230HgH() { // from class: X.10yX
                            public final /* synthetic */ int LIZJ = 0;

                            @Override // X.InterfaceC447230HgH
                            public final void accept(Object obj) {
                                Bitmap bitmap = (Bitmap) obj;
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                                    int i2 = i;
                                    bitmapDrawable.setBounds(0, 0, i2, i2);
                                    interfaceC1631620sYq.invoke(Integer.valueOf((textExtraStruct.getEnd() - 1) + this.LIZJ), Integer.valueOf(textExtraStruct.getEnd() + this.LIZJ), new C416750GVt(bitmapDrawable));
                                    C19421710yd c19421710yd2 = C19421710yd.LIZ;
                                    String str2 = str;
                                    String hashTagName = textExtraStruct.getHashTagName();
                                    c19421710yd2.getClass();
                                    C19421710yd.LIZLLL(str2, hashTagName);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, android.text.SpannableString] */
    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIIJ(final String str, boolean z, final TextView textView, final boolean z2, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = new SpannableString(str);
            UrlModel urlModelLIZIZ = C19421710yd.LIZIZ(str, z, z2);
            if (urlModelLIZIZ == null) {
                textView.setText((CharSequence) c259800zU.element);
                return false;
            }
            final int textSize = (int) textView.getTextSize();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(C20642515q3.LJI(2131848665));
            c259800zU.element = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModelLIZIZ));
            c1331670kl3LJIIIIZZ.LIZLLL("hashtagemoji");
            c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.10yV
                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    String strSubstring;
                    if (bitmap == null) {
                        return;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                    int i = textSize;
                    bitmapDrawable.setBounds(0, 0, i, i);
                    C416750GVt c416750GVt = new C416750GVt(bitmapDrawable);
                    SpannableString spannableString = c259800zU.element;
                    C786410Ut5.p2(spannableString, c416750GVt, spannableString.length() - 1, c259800zU.element.length(), 33);
                    textView.setText(c259800zU.element);
                    String str3 = str;
                    if (str3 != null && str3.length() != 0) {
                        C19421710yd c19421710yd = C19421710yd.LIZ;
                        String str4 = str2;
                        if (z2) {
                            strSubstring = str.substring(1);
                        } else {
                            strSubstring = str;
                        }
                        c19421710yd.getClass();
                        C19421710yd.LIZLLL(str4, strSubstring);
                    }
                }
            });
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService
    public final boolean LJIJI(final String str, UrlModel urlModel, SpannableString spannableString, final TextView textView, final String str2) {
        if (TextUtils.isEmpty(String.valueOf(spannableString))) {
            return false;
        }
        final int textSize = (int) textView.getTextSize();
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        textView.setText(spannableStringBuilder);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LIZLLL("hashtagemoji");
        c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.10yU
            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                int i = textSize;
                bitmapDrawable.setBounds(0, 0, i, i);
                C416750GVt c416750GVt = new C416750GVt(bitmapDrawable);
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                C786410Ut5.q2(spannableStringBuilder2, c416750GVt, spannableStringBuilder2.length() - 1, spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                String str3 = str;
                if (str3 != null && str3.length() != 0) {
                    C19421710yd c19421710yd = C19421710yd.LIZ;
                    String str4 = str2;
                    String str5 = str;
                    c19421710yd.getClass();
                    C19421710yd.LIZLLL(str4, str5);
                }
            }
        });
        return true;
    }
}
