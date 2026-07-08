package com.ss.android.ugc.aweme.texttoimage;

import X.C064P;
import X.C07CI;
import X.C09AE;
import X.C0I92;
import X.C0LAB;
import X.C0LCF;
import X.C0SUA;
import X.C1331660kl2;
import X.C13LP;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1697810uHb;
import X.C19588711kT;
import X.C19A3;
import X.C19EG;
import X.C2188811AlT;
import X.C23250099c;
import X.C259470AEv;
import X.C277130Atb;
import X.C277210Atj;
import X.C418440Gaw;
import X.C426750GoL;
import X.C528180KnY;
import X.C562670M4z;
import X.C572250McR;
import X.C572310McX;
import X.C572350Mcb;
import X.C572370Mcd;
import X.C572410Mch;
import X.C572420Mci;
import X.C572490Mcp;
import X.C572500Mcq;
import X.C572510Mcr;
import X.C572540Mcu;
import X.C572560Mcw;
import X.C580790MqD;
import X.C705930RmZ;
import X.C786410Ut5;
import X.C814420VxA;
import X.C857790Xkv;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.ss.android.ugc.aweme.texttoimage.setting.TextToImageUrlsConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS93S1000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageServiceImpl implements ITextToImageService {
    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LIZJ() {
        C572540Mcu.LIZ.getClass();
        if (C528180KnY.LIZIZ().enable) {
            C1331660kl2.LJIIIZ(((TextToImageUrlsConfig) C572560Mcw.LIZIZ.getValue()).editBgUrl).LJJIII();
        }
        if (C528180KnY.LIZIZ().enable) {
            C1331660kl2.LJIIIIZZ(C572540Mcu.LIZ()).LJJIII();
            if (C572540Mcu.LIZ() == null) {
                C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
                HashMap map = new HashMap();
                map.put(C572540Mcu.LIZIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel("text_2_image_resource")));
                C580790MqD c580790MqD = new C580790MqD(0);
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setChannelUpdatePriority(3);
                optionCheckUpdateParams.setListener(c580790MqD);
                if (c1551950qULLJIILL != null) {
                    c1551950qULLJIILL.LIZ("", map, optionCheckUpdateParams);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final TextToImageEditScene LJ() {
        return new TextToImageEditScene();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJI() {
        ConcurrentHashMap<String, C572420Mci> concurrentHashMap = C0I92.LIZ;
        List<C572420Mci> listLLIIII = C13LP.LLIIII(concurrentHashMap.values());
        concurrentHashMap.clear();
        for (C572420Mci c572420Mci : listLLIIII) {
            if (c572420Mci.LIZIZ.isActive()) {
                c572420Mci.LIZIZ.LIZIZ(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJIIIIZZ() {
        C562670M4z.LIZ.getClass();
        return C562670M4z.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIIJJI() {
        C572490Mcp.LIZ.getClass();
        Iterator<T> it2 = C572490Mcp.LIZJ.values().iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        C572490Mcp.LIZJ.clear();
        C572490Mcp.LIZIZ.clear();
        C572490Mcp.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIILL() {
        C562670M4z.LIZ.getClass();
        if (C07CI.LIZIZ()) {
            C562670M4z.LIZIZ.storeBoolean("shown_text_to_image_ai_tag", true);
            return;
        }
        C528180KnY.LIZ.getClass();
        if (C528180KnY.LJ()) {
            C562670M4z.LIZIZ.storeBoolean("shown_new_tag", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final TextImageAIGCInterceptor LJIIZILJ() {
        return new TextImageAIGCInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final C0LCF LJIJJLI() {
        return new C0LCF();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJJIFFI() {
        C562670M4z.LIZ.getClass();
        return !C562670M4z.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final TextToImageChooseScene LJJIII() {
        return new TextToImageChooseScene();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final OpenTextImageInterceptor LJJIIZI() {
        return new OpenTextImageInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJL() {
        C572540Mcu.LIZ.getClass();
        if (C528180KnY.LIZIZ().enable && C277130Atb.LIZ()) {
            List listLJIIJJI = ((Number) C277210Atj.LIZ.getValue()).intValue() == 1 ? C1697810uHb.LJIIJJI(new CheckRequestBodyModel.TargetChannel("text_2_image_font"), new CheckRequestBodyModel.TargetChannel("text_2_image_new_text_template"), new CheckRequestBodyModel.TargetChannel("text_2_image_background")) : C1697810uHb.LJIIJJI(new CheckRequestBodyModel.TargetChannel("text_2_image_font_ask_type"), new CheckRequestBodyModel.TargetChannel("text_2_image_new_text_template"), new CheckRequestBodyModel.TargetChannel("text_2_image_background_ask_type"));
            C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
            HashMap map = new HashMap();
            map.put(C572540Mcu.LIZIZ, listLJIIJJI);
            C580790MqD c580790MqD = new C580790MqD(1);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setListener(c580790MqD);
            if (c1551950qULLJIILL != null) {
                c1551950qULLJIILL.LIZ("", map, optionCheckUpdateParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJLIJ() {
        C562670M4z.LIZ.getClass();
        C562670M4z.LIZIZ.storeBoolean("shown_text_to_image_COMMENT_hint", true);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJJIL() {
        C562670M4z.LIZ.getClass();
        Boolean boolValueOf = C562670M4z.LJFF;
        if (boolValueOf == null) {
            C562670M4z.LJFF = Boolean.TRUE;
            boolValueOf = Boolean.valueOf(C562670M4z.LIZIZ.getBoolean("shown_text_to_image_COMMENT_hint", false));
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final Class<? extends C19A3> LJIILIIL() {
        return TextToImageChooseScene.class;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final Class<?> LJJI() {
        return C19588711kT.class;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final C572350Mcb LJJII() {
        return C572350Mcb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final Class<? extends C19A3> LJJIIJ() {
        return TextToImageEditScene.class;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final Pair<String, String> LIZLLL(String str) {
        C572410Mch c572410Mch;
        C572490Mcp.LIZ.getClass();
        C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
        if (c572500Mcq != null && (c572410Mch = c572500Mcq.LIZ) != null) {
            return new Pair<>(c572410Mch.LJ, c572410Mch.LIZLLL);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final String LJFF(String str) {
        C572410Mch c572410Mch;
        CreativeInfo creativeInfo;
        C572490Mcp.LIZ.getClass();
        C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
        if (c572500Mcq != null && (c572410Mch = c572500Mcq.LIZ) != null && (creativeInfo = c572410Mch.LIZJ) != null) {
            return creativeInfo.getCreationId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIILJJIL(String str) {
        C572490Mcp.LIZ.getClass();
        C572490Mcp.LIZIZ.remove(str);
        C09AE c09aeRemove = C572490Mcp.LIZJ.remove(str);
        if (c09aeRemove != null) {
            c09aeRemove.LIZIZ(null);
        }
        C572490Mcp.LIZLLL.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final View LJIL(final Context context) {
        C572510Mcr.LIZ.getClass();
        if (C07CI.LIZIZ()) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
            C426750GoL.LJIIL(tuxIconView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, 16);
            tuxIconView.setIconRes(R.raw.icon_color_ai_text_tag);
            return tuxIconView;
        }
        TuxTextView tuxTextView = new TuxTextView(context) { // from class: X.0FJG
            public final Paint LLJJJJ;
            public final PorterDuffXfermode LLJJJJJIL;
            public final RectF LLJJJJLIIL;

            {
                Paint paint = new Paint(1);
                this.LLJJJJ = paint;
                this.LLJJJJLIIL = new RectF();
                paint.setColor(-1);
                this.LLJJJJJIL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }

            @Override // android.widget.TextView, android.view.View
            public final void onDraw(Canvas canvas) {
                RectF rectF = this.LLJJJJLIIL;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = getWidth();
                rectF.bottom = getHeight();
                canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                float f = 2;
                canvas.drawRoundRect(this.LLJJJJLIIL, getHeight() / f, getHeight() / f, this.LLJJJJ);
                getPaint().setXfermode(this.LLJJJJJIL);
                super.onDraw(canvas);
                canvas.restore();
            }
        };
        tuxTextView.setText(context.getString(2131821549).toUpperCase(Locale.ROOT));
        tuxTextView.setTuxFont(93);
        tuxTextView.LJJJJI(9.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
        tuxTextView.setLayoutParams(layoutParams);
        C426750GoL.LJIIL(tuxTextView, 10, 0, 10, 0, 16);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final String LJJ(String str) {
        C572410Mch c572410Mch;
        C572490Mcp.LIZ.getClass();
        C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
        if (c572500Mcq != null && (c572410Mch = c572500Mcq.LIZ) != null) {
            if (c572410Mch.LIZ()) {
                return "ai_rewrite";
            }
            return "original_comment";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIIJ(ForwardMedia forwardMedia, C572370Mcd c572370Mcd) {
        C572350Mcb.LIZ.getClass();
        C572350Mcb.LJFF(forwardMedia, c572370Mcd);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final C857790Xkv LJIJJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        return new C857790Xkv(c19eg, videoPublishEditModel, true);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIIZ(String str, ICommentInlineBannerReadyListener iCommentInlineBannerReadyListener) {
        CopyOnWriteArrayList<ICommentInlineBannerReadyListener> copyOnWriteArrayListPutIfAbsent;
        C572490Mcp.LIZ.getClass();
        if (str.length() != 0) {
            C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
            if (c572500Mcq != null) {
                iCommentInlineBannerReadyListener.onReady(str, c572500Mcq.LIZ.LIZ, c572500Mcq);
                return;
            }
            ConcurrentHashMap<String, CopyOnWriteArrayList<ICommentInlineBannerReadyListener>> concurrentHashMap = C572490Mcp.LIZLLL;
            CopyOnWriteArrayList<ICommentInlineBannerReadyListener> copyOnWriteArrayList = concurrentHashMap.get(str);
            if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
                copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
            }
            copyOnWriteArrayList.addIfAbsent(iCommentInlineBannerReadyListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJIIJI(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (videoPublishEditModel == null) {
            return;
        }
        C572310McX.LIZJ(c0lab, videoPublishEditModel, null, false);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJIL(String str, ICommentInlineBannerReadyListener iCommentInlineBannerReadyListener) {
        C572490Mcp.LIZ.getClass();
        CopyOnWriteArrayList<ICommentInlineBannerReadyListener> copyOnWriteArrayList = C572490Mcp.LIZLLL.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(iCommentInlineBannerReadyListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final C0SUA LJIIL(C19EG c19eg, Aweme aweme, C705930RmZ c705930RmZ) {
        return new C0SUA(c19eg, aweme, c705930RmZ);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJIJI(Context context, String str, Bundle bundle) {
        C572490Mcp.LIZ.getClass();
        C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
        if (c572500Mcq == null) {
            return false;
        }
        C572490Mcp.LIZ(context, c572500Mcq, bundle);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJJIIJZLJL(Context context, Object obj, Bundle bundle) {
        C572500Mcq c572500Mcq;
        C572490Mcp.LIZ.getClass();
        if ((obj instanceof C572500Mcq) && (c572500Mcq = (C572500Mcq) obj) != null) {
            C572490Mcp.LIZ(context, c572500Mcq, bundle);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIILLIIL(String str, String str2, String str3, boolean z) {
        ConcurrentHashMap<String, C572420Mci> concurrentHashMap = C0I92.LIZ;
        if (((Boolean) C259470AEv.LIZ.getValue()).booleanValue() && str.length() != 0 && !a0.LJJJIL(str2)) {
            ConcurrentHashMap<String, C572420Mci> concurrentHashMap2 = C0I92.LIZ;
            if (!concurrentHashMap2.containsKey(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(UUID.randomUUID());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                long jCurrentTimeMillis = System.currentTimeMillis();
                AtomicLong atomicLong = new AtomicLong(0L);
                concurrentHashMap2.put(str, new C572420Mci(strLIZIZ, C23250099c.LIZIZ(C0I92.LIZIZ, null, null, new C064P(str2, strLIZIZ, str, z, str3, atomicLong, null), 3), jCurrentTimeMillis, atomicLong));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJ(Context context, String str, ForwardMedia forwardMedia, C572370Mcd c572370Mcd) {
        C572490Mcp.LIZ.getClass();
        if (context != null) {
            C572500Mcq c572500Mcq = C572490Mcp.LIZIZ.get(str);
            if (c572500Mcq != null) {
                CopyOnWriteArrayList<ICommentInlineBannerReadyListener> copyOnWriteArrayList = C572490Mcp.LIZLLL.get(str);
                if (copyOnWriteArrayList != null) {
                    Iterator<ICommentInlineBannerReadyListener> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onReady(str, c572500Mcq.LIZ.LIZ, c572500Mcq);
                    }
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C09AE> concurrentHashMap = C572490Mcp.LIZJ;
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.put(str, C572350Mcb.LJIIJ(C572350Mcb.LIZ, context, forwardMedia, c572370Mcd, "preview_card", new AwS122S1100000_8(c572370Mcd, str, 7), new AwS93S1000000_8(str, 0)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJIIIZ(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function0<Unit> function0, Function0<Unit> function02) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        String cid;
        C572500Mcq c572500Mcq;
        C572490Mcp.LIZ.getClass();
        Comment commentInfo = c572370Mcd.getCommentInfo();
        C572410Mch c572410Mch = null;
        if (commentInfo != null && (cid = commentInfo.getCid()) != null && cid.length() > 0 && (c572500Mcq = C572490Mcp.LIZIZ.get(cid)) != null) {
            c572410Mch = c572500Mcq.LIZ;
        }
        if (c572410Mch != null && (videoPublishEditModel = c572410Mch.LIZIZ) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null) {
            C572250McR.LIZ(text2ImageModel, c572370Mcd.getEtParams());
        }
        C572350Mcb.LJIIIZ(C572350Mcb.LIZ, context, forwardMedia, c572370Mcd, function0, function02, c572410Mch, null, 64);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r4 = this;
            X.0McQ r0 = X.C572240McQ.LIZ
            r0.getClass()
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.LJ(r0, r6)
            r2 = 0
            if (r5 == 0) goto Lbc
            int r0 = r5.getAwemeType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L1a:
            java.lang.String r0 = "aweme_type"
            r3.LIZLLL(r1, r0)
            if (r5 == 0) goto Lb9
            java.lang.String r1 = r5.getAid()
        L25:
            java.lang.String r0 = "group_id"
            r3.LJ(r0, r1)
            if (r5 == 0) goto L36
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.getUid()
        L36:
            java.lang.String r0 = "author_id"
            r3.LJ(r0, r2)
            java.lang.String r1 = "pic_cnt"
            int r0 = X.C735370Ssx.LJIILL(r5)
            r3.LIZ(r0, r1)
            java.lang.String r0 = "to_group_id"
            r3.LJ(r0, r7)
            java.lang.String r0 = "to_author_id"
            r3.LJ(r0, r8)
            r2 = 1
            if (r5 == 0) goto Lb6
            com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo r0 = r5.getPhotoModeTextInfo()
            if (r0 == 0) goto Lb6
            boolean r0 = r0.isAISummary()
            if (r0 != r2) goto Lb6
            java.lang.String r1 = "ai_summary"
        L5f:
            java.lang.String r0 = "ori_context_type"
            r3.LJ(r0, r1)
            if (r5 == 0) goto Laa
            com.ss.android.ugc.aweme.feed.model.PhotoModeTextInfo r0 = r5.getPhotoModeTextInfo()
            if (r0 == 0) goto Laa
            boolean r0 = r0.isComment2Post()
            if (r0 != r2) goto Laa
            java.util.List r1 = r5.getInteractStickerStructs()
            if (r1 == 0) goto Laa
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Laa
            java.util.Iterator r2 = r1.iterator()
        L82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
            int r1 = r0.getType()
            r0 = 116(0x74, float:1.63E-43)
            if (r1 != r0) goto L82
            java.lang.String r1 = "cmt_to_post"
        L98:
            java.lang.String r0 = "text_style_type"
            r3.LJ(r0, r1)
            java.lang.String r0 = "action_position"
            r3.LJ(r0, r9)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "click_comment_to_post_original_link"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        Laa:
            boolean r0 = X.C720360SNm.LJ(r5)
            if (r0 == 0) goto Lb3
            java.lang.String r1 = "ai_gen"
            goto L98
        Lb3:
            java.lang.String r1 = "normal"
            goto L98
        Lb6:
            java.lang.String r1 = "ori_text"
            goto L5f
        Lb9:
            r1 = r2
            goto L25
        Lbc:
            r1 = r2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.TextToImageServiceImpl.LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final void LJJIJIIJIL(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        C572350Mcb.LJIIIZ(C572350Mcb.LIZ, context, forwardMedia, c572370Mcd, function0, null, null, function1, 48);
    }

    @Override // com.ss.android.ugc.aweme.texttoimage.ITextToImageService
    public final boolean LJII(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Object obj, Function0<Unit> function0, Function0<Unit> function02) {
        C572500Mcq c572500Mcq;
        C572490Mcp.LIZ.getClass();
        if ((obj instanceof C572500Mcq) && (c572500Mcq = (C572500Mcq) obj) != null) {
            C572250McR.LIZ(c572500Mcq.LIZ.LIZIZ.creativeModel.text2ImageModel, c572370Mcd.getEtParams());
            C572350Mcb.LJIIIZ(C572350Mcb.LIZ, context, forwardMedia, c572370Mcd, function0, function02, c572500Mcq.LIZ, null, 64);
            return true;
        }
        return false;
    }
}
