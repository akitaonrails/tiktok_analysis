package com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge;

import X.C01GW;
import X.C0I0B;
import X.C0IB5;
import X.C0IB7;
import X.C0PEM;
import X.C0Z4Q;
import X.C0Z9Z;
import X.C0ZD8;
import X.C0ZD9;
import X.C0ZDA;
import X.C0ZDC;
import X.C0ZDJ;
import X.C0ZDK;
import X.C0ZDL;
import X.C0ZDM;
import X.C0ZDP;
import X.C0ZDQ;
import X.C1336205Ku;
import X.C13LQ;
import X.C18JY;
import X.C1908480zlO;
import X.C1954807lC;
import X.C1BA7;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2241931Cox;
import X.C2296808zG;
import X.C23250099c;
import X.C286570BLb;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C560910LzF;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C894660Z7w;
import X.C896120ZDm;
import X.C896140ZDo;
import X.EnumC895010Z9f;
import X.EnumC896030ZDd;
import X.InterfaceC1365230ldB;
import X.InterfaceC895030Z9h;
import X.InterfaceC895790ZCf;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class IMNudgeAndStreakService implements IIMNudgeAndStreakService, InterfaceC895790ZCf, InterfaceC1365230ldB, InterfaceC895030Z9h, C0Z9Z {
    public static final IMNudgeAndStreakService LJFF = new IMNudgeAndStreakService();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(196));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(195));
    public final /* synthetic */ C0ZDK LIZIZ = C0ZDK.LIZIZ;
    public final /* synthetic */ C0IB5 LIZJ = C0IB5.LIZIZ;
    public final /* synthetic */ C0ZD8 LIZLLL = C0ZD8.LIZIZ;
    public final /* synthetic */ C0ZDC LJ = C0ZDC.LIZIZ;

    public static final class Service implements IIMNudgeAndStreakService {
        public final /* synthetic */ IMNudgeAndStreakService LIZIZ = IMNudgeAndStreakService.LJFF;

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LIZ(int i) {
            return this.LIZIZ.LIZ(i);
        }

        @Override // X.InterfaceC895030Z9h
        public final boolean LIZIZ(C0ZD9 c0zd9, boolean z, String str, C0ZDA c0zda, C0ZDM c0zdm, String str2) {
            return this.LIZIZ.LIZIZ(c0zd9, z, str, c0zda, c0zdm, str2);
        }

        @Override // X.InterfaceC1365230ldB
        public final AttachmentComponent LIZJ(Aweme aweme, User user, C0IB7 c0ib7) {
            return this.LIZIZ.LIZJ(aweme, user, c0ib7);
        }

        @Override // X.InterfaceC1365230ldB
        public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
            return this.LIZIZ.LIZLLL(aweme);
        }

        @Override // X.InterfaceC1365230ldB
        public final Map<String, String> LJ(Long l, Long l2, AttachmentComponent attachmentComponent, String str) {
            return this.LIZIZ.LJ(l, l2, attachmentComponent, str);
        }

        @Override // X.InterfaceC1365230ldB
        public final AttachmentComponent LJFF(Serializable serializable, C0IB7 c0ib7) {
            return this.LIZIZ.LJFF(serializable, c0ib7);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJI(SetSticker setSticker) {
            return this.LIZIZ.LJI(setSticker);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIIIZ(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIIIZ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIIJ(int i) {
            return this.LIZIZ.LJIIJ(i);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIIJJI(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIIJJI(c869590Y9l);
        }

        @Override // X.InterfaceC1365230ldB
        public final AttachmentTypeComponent LJIIL(C0IB7 c0ib7) {
            return this.LIZIZ.LJIIL(c0ib7);
        }

        @Override // X.C0Z9Z
        public final void LJIILIIL() {
            this.LIZIZ.LJIILIIL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final String LJIILJJIL(boolean z) {
            return this.LIZIZ.LJIILJJIL(z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIILL(Map<String, String> map) {
            return this.LIZIZ.LJIILL(map);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIILLIIL(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIILLIIL(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIIZILJ(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIIZILJ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIJ(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIJ(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIJI(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIJI(c869590Y9l);
        }

        @Override // X.InterfaceC895790ZCf
        public final Integer LJIJJ() {
            return this.LIZIZ.LJIJJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final Map LJIJJLI(Long l, Long l2) {
            return this.LIZIZ.LJIJJLI(l, l2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJIL(C869590Y9l c869590Y9l) {
            return this.LIZIZ.LJIL(c869590Y9l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final String LJJ(boolean z) {
            return this.LIZIZ.LJJ(z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final Drawable LJJI() {
            return this.LIZIZ.LJJI();
        }

        @Override // X.C0Z9Z
        public final boolean LJJIFFI(EnumC896030ZDd enumC896030ZDd, String str, String str2) {
            return this.LIZIZ.LJJIFFI(enumC896030ZDd, str, str2);
        }

        @Override // X.InterfaceC895030Z9h
        public final void LJJII(String str) {
            this.LIZIZ.LJJII(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final String LJJIII(Long l, Long l2) {
            return this.LIZIZ.LJJIII(l, l2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJJIIJ(Long l, Long l2) {
            return this.LIZIZ.LJJIIJ(l, l2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJJIIJZLJL(InnerPushMessage innerPushMessage, Function0<Unit> function0) {
            return this.LIZIZ.LJJIIJZLJL(innerPushMessage, function0);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final String LJJIIZ(C869590Y9l c869590Y9l, boolean z) {
            return this.LIZIZ.LJJIIZ(c869590Y9l, z);
        }

        @Override // X.InterfaceC1365230ldB
        public final AttachmentComponent LJJIJ(String str, Integer num, String str2, String str3, AttachmentTypeComponent attachmentTypeComponent, boolean z, FallbackStatusComponent fallbackStatusComponent, Long l) {
            return this.LIZIZ.LJJIJ(str, num, str2, str3, attachmentTypeComponent, z, fallbackStatusComponent, l);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final void LJJIJIIJI(View view) {
            this.LIZIZ.LJJIJIIJI(view);
        }

        @Override // X.InterfaceC1365230ldB
        public final BaseContent.ReferenceVideo LJJIJIIJIL(boolean z, Integer num, String str, String str2, String str3, FallbackStatusComponent fallbackStatusComponent, Long l) {
            return this.LIZIZ.LJJIJIIJIL(z, num, str, str2, str3, fallbackStatusComponent, l);
        }

        @Override // X.InterfaceC1365230ldB
        public final PreviewHintComponent LJJIJIL(long j, long j2, AttachmentTypeComponent attachmentTypeComponent, String str, boolean z, Context context) {
            return this.LIZIZ.LJJIJIL(j, j2, attachmentTypeComponent, str, z, context);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final String LJJIJL(C869590Y9l c869590Y9l, boolean z) {
            return this.LIZIZ.LJJIJL(c869590Y9l, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJJIJLIJ(Bundle bundle) {
            return this.LIZIZ.LJJIJLIJ(bundle);
        }

        @Override // X.InterfaceC895790ZCf
        public final Drawable LJJIL(Context context) {
            return this.LIZIZ.LJJIL(context);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJJIZ() {
            return this.LIZIZ.LJJIZ();
        }

        @Override // X.InterfaceC895790ZCf
        public final String LJJJ() {
            return this.LIZIZ.LJJJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final int LJJJI() {
            return this.LIZIZ.LJJJI();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final boolean LJJJIL(Map<String, String> map) {
            return this.LIZIZ.LJJJIL(map);
        }

        @Override // X.InterfaceC895030Z9h
        public final boolean LJJJJ(C0ZD9 c0zd9, String str, C0ZDA c0zda, C0ZDM c0zdm, String str2) {
            return this.LIZIZ.LJJJJ(c0zd9, str, c0zda, c0zdm, str2);
        }

        @Override // X.C0Z9Z
        public final boolean LJJJJI(C0ZD9 c0zd9) {
            return this.LIZIZ.LJJJJI(c0zd9);
        }

        @Override // X.InterfaceC895790ZCf
        public final String getString(int i) {
            return this.LIZIZ.getString(i);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final C896140ZDo LJII() {
            this.LIZIZ.getClass();
            return (C896140ZDo) IMNudgeAndStreakService.LJII.getValue();
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
        public final C896120ZDm LJJIIZI() {
            this.LIZIZ.getClass();
            return new C896120ZDm();
        }

        @Override // X.InterfaceC1365230ldB
        public final Map<String, String> LJIIIIZZ(SetSticker setSticker, AttachmentComponent attachmentComponent, String str) {
            return this.LIZIZ.LIZJ.LJIIIIZZ(setSticker, attachmentComponent, str);
        }
    }

    @Override // X.InterfaceC895030Z9h
    public final boolean LIZIZ(C0ZD9 c0zd9, boolean z, String str, C0ZDA c0zda, C0ZDM c0zdm, String str2) {
        return this.LIZLLL.LIZIZ(c0zd9, z, str, c0zda, c0zdm, str2);
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LIZJ(Aweme aweme, User user, C0IB7 c0ib7) {
        return this.LIZJ.LIZJ(aweme, user, c0ib7);
    }

    @Override // X.InterfaceC1365230ldB
    public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
        return this.LIZJ.LIZLLL(aweme);
    }

    @Override // X.InterfaceC1365230ldB
    public final Map<String, String> LJ(Long l, Long l2, AttachmentComponent attachmentComponent, String str) {
        return this.LIZJ.LJ(l, l2, attachmentComponent, str);
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LJFF(Serializable serializable, C0IB7 c0ib7) {
        return this.LIZJ.LJFF(serializable, c0ib7);
    }

    @Override // X.InterfaceC1365230ldB
    public final Map<String, String> LJIIIIZZ(SetSticker setSticker, AttachmentComponent attachmentComponent, String str) {
        return this.LIZJ.LJIIIIZZ(setSticker, attachmentComponent, str);
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentTypeComponent LJIIL(C0IB7 c0ib7) {
        return this.LIZJ.LJIIL(c0ib7);
    }

    @Override // X.C0Z9Z
    public final void LJIILIIL() {
        this.LJ.LJIILIIL();
    }

    @Override // X.InterfaceC895790ZCf
    public final Integer LJIJJ() {
        return this.LIZIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final String LJJ(boolean z) {
        return z ? "action_bar:nudge_back" : "action_bar:nudge";
    }

    @Override // X.C0Z9Z
    public final boolean LJJIFFI(EnumC896030ZDd enumC896030ZDd, String str, String str2) {
        return this.LJ.LJJIFFI(enumC896030ZDd, str, str2);
    }

    @Override // X.InterfaceC895030Z9h
    public final void LJJII(String str) {
        this.LIZLLL.LJJII(str);
    }

    @Override // X.InterfaceC1365230ldB
    public final AttachmentComponent LJJIJ(String str, Integer num, String str2, String str3, AttachmentTypeComponent attachmentTypeComponent, boolean z, FallbackStatusComponent fallbackStatusComponent, Long l) {
        return this.LIZJ.LJJIJ(str, num, str2, str3, attachmentTypeComponent, z, fallbackStatusComponent, l);
    }

    @Override // X.InterfaceC1365230ldB
    public final BaseContent.ReferenceVideo LJJIJIIJIL(boolean z, Integer num, String str, String str2, String str3, FallbackStatusComponent fallbackStatusComponent, Long l) {
        return this.LIZJ.LJJIJIIJIL(z, num, str, str2, str3, fallbackStatusComponent, l);
    }

    @Override // X.InterfaceC1365230ldB
    public final PreviewHintComponent LJJIJIL(long j, long j2, AttachmentTypeComponent attachmentTypeComponent, String str, boolean z, Context context) {
        return this.LIZJ.LJJIJIL(j, j2, attachmentTypeComponent, str, z, context);
    }

    @Override // X.InterfaceC895790ZCf
    public final Drawable LJJIL(Context context) {
        return this.LIZIZ.LJJIL(context);
    }

    @Override // X.InterfaceC895790ZCf
    public final String LJJJ() {
        return this.LIZIZ.LJJJ();
    }

    @Override // X.InterfaceC895030Z9h
    public final boolean LJJJJ(C0ZD9 c0zd9, String str, C0ZDA c0zda, C0ZDM c0zdm, String str2) {
        return this.LIZLLL.LJJJJ(c0zd9, str, c0zda, c0zdm, str2);
    }

    @Override // X.C0Z9Z
    public final boolean LJJJJI(C0ZD9 c0zd9) {
        return this.LJ.LJJJJI(c0zd9);
    }

    @Override // X.InterfaceC895790ZCf
    public final String getString(int i) {
        return this.LIZIZ.getString(i);
    }

    static {
        Emoji emoji = C1BA7.LIZ;
    }

    public static C0ZDL LJJJJIZL() {
        return (C0ZDL) LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final C896140ZDo LJII() {
        return (C896140ZDo) LJII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final Drawable LJJI() {
        C0I0B.LJFF.LIZJ();
        Context contextLIZ = C894660Z7w.LIZ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_bitmap_streak_interaction;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(contextLIZ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(contextLIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final C896120ZDm LJJIIZI() {
        return new C896120ZDm();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJJIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final int LJJJI() {
        return LJJIZ() ? 1 : -1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LIZ(int i) {
        if (C13LQ.LJJIJ(i, new int[]{1, 2, 29}) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJI(SetSticker setSticker) {
        Long stickerId = setSticker.getStickerId();
        if (stickerId != null) {
            Long lValueOf = Long.valueOf(stickerId.longValue());
            Long setId = setSticker.getSetId();
            if (setId != null) {
                return LJJIIJ(lValueOf, Long.valueOf(setId.longValue()));
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIIIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && LJJJIL(c869590Y9l.getExt()) && C560910LzF.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIIJ(int i) {
        Integer numLJIJJ = LJIJJ();
        if (numLJIJJ != null && i == numLJIJJ.intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIIJJI(C869590Y9l c869590Y9l) {
        if (!LJIIIZ(c869590Y9l)) {
            LJJJJIZL().getClass();
            if (c869590Y9l == null || !Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "action_bar:spark_back")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final String LJIILJJIL(boolean z) {
        LJJJJIZL().getClass();
        if (z) {
            return "action_bar:spark_back";
        }
        return "action_bar:spark";
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIILL(Map<String, String> map) {
        return Intrinsics.LJFF(map.get("a:src"), "action_bar:nudge");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIILLIIL(C869590Y9l c869590Y9l) {
        if (!LJIIZILJ(c869590Y9l) && !LJIIIZ(c869590Y9l) && !LJIJI(c869590Y9l) && !LJIJ(c869590Y9l)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIIZILJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && LJIILL(c869590Y9l.getExt()) && C560910LzF.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIJ(C869590Y9l c869590Y9l) {
        String strLJI;
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (iLightInteractionPlatformService != null) {
            strLJI = iLightInteractionPlatformService.LJI(c869590Y9l);
        } else {
            strLJI = null;
        }
        if (!Intrinsics.LJFF(strLJI, EnumC895010Z9f.SPARK_BACK_V1.getLightInteractionName())) {
            LJJJJIZL().getClass();
            if (c869590Y9l == null || !Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "action_bar:spark_back")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIJI(C869590Y9l c869590Y9l) {
        String strLJI;
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (iLightInteractionPlatformService != null) {
            strLJI = iLightInteractionPlatformService.LJI(c869590Y9l);
        } else {
            strLJI = null;
        }
        if (!Intrinsics.LJFF(strLJI, EnumC895010Z9f.SPARK_V1.getLightInteractionName())) {
            LJJJJIZL().getClass();
            if (c869590Y9l == null || !Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "action_bar:spark")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJIL(C869590Y9l c869590Y9l) {
        if (!LJIIZILJ(c869590Y9l)) {
            LJJJJIZL().getClass();
            if (c869590Y9l == null || !Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "action_bar:spark")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final void LJJIJIIJI(View view) {
        Vibrator vibrator = (Vibrator) C786410Ut5.H2(view.getContext(), "vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(25L, 100));
        } else {
            vibrator.vibrate(25L);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJJIJLIJ(Bundle bundle) {
        LJJJJIZL().getClass();
        String string = bundle.getString("a:src");
        if (string != null) {
            if (Intrinsics.LJFF(string, "action_bar:spark") || Intrinsics.LJFF(string, "action_bar:spark_back")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJJJIL(Map<String, String> map) {
        return Intrinsics.LJFF(map.get("a:src"), "action_bar:nudge_back");
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final Map LJIJJLI(Long l, Long l2) {
        if (!LJJIIJ(l, l2)) {
            return C2097608Jq.LJ();
        }
        return C2097908Jt.LIZJ(new Pair("a:src", LJJ(false)));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final String LJJIII(Long l, Long l2) {
        if (LJJIIJ(l, l2)) {
            return "nudge";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJJIIJ(Long l, Long l2) {
        if (C286570BLb.LIZ()) {
            long j = C0Z4Q.LIZ().stickerId;
            if (l != null && l.longValue() == j) {
                long j2 = C0Z4Q.LIZ().stickerSetId;
                if (l2 != null && l2.longValue() == j2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final boolean LJJIIJZLJL(InnerPushMessage innerPushMessage, Function0<Unit> function0) {
        InnerPushUITemplate uiTemplate;
        User user;
        String uid;
        if (innerPushMessage.getTracker().LIZIZ || (uiTemplate = innerPushMessage.getUiTemplate()) == null) {
            return false;
        }
        innerPushMessage.getTracker().LIZIZ = true;
        C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 3);
        uiTemplate.setRightType(3);
        C0ZDJ.LIZ.getClass();
        uiTemplate.setRightBtnText(C0ZDJ.LIZJ(2131830941));
        uiTemplate.setRightImageUrl(null);
        uiTemplate.setRightImageResId(0);
        uiTemplate.setRightImageDrawable(null);
        uiTemplate.setRightImageHeight(0);
        uiTemplate.setRightImageWidth(0);
        uiTemplate.setRightImageRadius(0);
        uiTemplate.setGlobalSchemaUrl(uiTemplate.rightSchemaUrl);
        uiTemplate.setContent(C0ZDJ.LIZJ(2131831726));
        List<User> list = uiTemplate.fromUsers;
        if (list != null && (user = (User) ListProtector.get(list, 0)) != null && (uid = user.getUid()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ZDP(innerPushMessage, user, uid, null), 3);
        }
        function0.invoke();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final String LJJIIZ(C869590Y9l c869590Y9l, boolean z) {
        BaseTemplate baseTemplateLIZ;
        AttachmentComponent attachmentComponentHs;
        AttachmentTypeComponent attachmentTypeComponent;
        int iIntValue;
        int i;
        C0ZDJ.LIZ.getClass();
        if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIILLIIL(c869590Y9l)) {
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if (!(orParseJsonContent instanceof GifContent)) {
                orParseJsonContent = null;
            }
            if (orParseJsonContent != null) {
                Integer referenceScene = orParseJsonContent.getReferenceScene();
                if (referenceScene != null) {
                    iIntValue = referenceScene.intValue();
                } else {
                    iIntValue = 0;
                }
                String strLIZIZ = C0ZDJ.LIZIZ(c869590Y9l);
                if (iIntValue >= 0 && iIntValue < C0IB7.values().length && (i = C0ZDQ.LIZ[C0IB7.values()[iIntValue].ordinal()]) != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (z) {
                                    return C0ZDJ.LIZLLL(2131830861, strLIZIZ);
                                }
                                return C0ZDJ.LIZJ(2131830860);
                            }
                            throw new C1954807lC();
                        }
                        if (z) {
                            return C0ZDJ.LIZLLL(2131830856, strLIZIZ);
                        }
                        return C0ZDJ.LIZJ(2131830858);
                    }
                    if (z) {
                        return C0ZDJ.LIZLLL(2131830857, strLIZIZ);
                    }
                    return C0ZDJ.LIZJ(2131830859);
                }
                return "";
            }
            if (C286570BLb.LIZ()) {
                ByteString contentPB = c869590Y9l.getContentPB();
                int msgType = c869590Y9l.getMsgType();
                if (contentPB.size() > 0 && (baseTemplateLIZ = C2241931Cox.LIZ(contentPB, msgType)) != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null && (attachmentTypeComponent = attachmentComponentHs.type) != null) {
                    String strLIZIZ2 = C0ZDJ.LIZIZ(c869590Y9l);
                    int i2 = C0ZDQ.LIZIZ[attachmentTypeComponent.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (z) {
                                    return C0ZDJ.LIZLLL(2131830861, strLIZIZ2);
                                }
                                return C0ZDJ.LIZJ(2131830860);
                            }
                            return "";
                        }
                        if (z) {
                            return C0ZDJ.LIZLLL(2131830856, strLIZIZ2);
                        }
                        return C0ZDJ.LIZJ(2131830858);
                    }
                    if (z) {
                        return C0ZDJ.LIZLLL(2131830857, strLIZIZ2);
                    }
                    return C0ZDJ.LIZJ(2131830859);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService
    public final String LJJIJL(C869590Y9l c869590Y9l, boolean z) {
        int iIntValue;
        int i;
        Integer referenceScene;
        C0ZDJ.LIZ.getClass();
        if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIILLIIL(c869590Y9l)) {
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if ((orParseJsonContent instanceof GifContent) && orParseJsonContent != null && (referenceScene = orParseJsonContent.getReferenceScene()) != null) {
                iIntValue = referenceScene.intValue();
            } else {
                iIntValue = 0;
            }
            String strLIZIZ = C0ZDJ.LIZIZ(c869590Y9l);
            if (iIntValue >= 0 && iIntValue < C0IB7.values().length && (i = C0ZDQ.LIZ[C0IB7.values()[iIntValue].ordinal()]) != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (z) {
                                return C0ZDJ.LIZLLL(2131830855, strLIZIZ);
                            }
                            return C0ZDJ.LIZJ(2131830854);
                        }
                        throw new C1954807lC();
                    }
                    if (z) {
                        return C0ZDJ.LIZLLL(2131830850, strLIZIZ);
                    }
                    return C0ZDJ.LIZJ(2131830852);
                }
                if (z) {
                    return C0ZDJ.LIZLLL(2131830851, strLIZIZ);
                }
                return C0ZDJ.LIZJ(2131830853);
            }
            return "";
        }
        return "";
    }
}
