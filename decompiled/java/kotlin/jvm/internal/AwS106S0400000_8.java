package kotlin.jvm.internal;

import X.C08HM;
import X.C09AY;
import X.C09BH;
import X.C09JN;
import X.C09K7;
import X.C0CNO;
import X.C0L9U;
import X.C0LBH;
import X.C0M4A;
import X.C0M4E;
import X.C0M5N;
import X.C0M5P;
import X.C0MH7;
import X.C0MH8;
import X.C0MZ9;
import X.C0MZJ;
import X.C0PEM;
import X.C0VSJ;
import X.C118300cf;
import X.C11NZ;
import X.C11S5;
import X.C12ES;
import X.C1322110kVd;
import X.C1397620mTQ;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1429320nIY;
import X.C1443400nfG;
import X.C1443990ngD;
import X.C1444180ngW;
import X.C1444940nhk;
import X.C1447800nmM;
import X.C1701940uOG;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2286708xd;
import X.C23250099c;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C238400w2;
import X.C259800zU;
import X.C383300F1c;
import X.C443530HaJ;
import X.C493401w4;
import X.C527600Kmc;
import X.C535470KzJ;
import X.C538870LBl;
import X.C538890LBn;
import X.C540280LGw;
import X.C565950MHp;
import X.C568790MSn;
import X.C574800MgY;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC1478005qU;
import X.InterfaceC1655610tBX;
import Y.AfS138S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VERecordData;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class AwS106S0400000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C0CNO.LIZLLL(0L, new AwS16S0410000_8((MvChoosePhotoScene) awS106S0400000_8.l0, (MvChoosePhotoScene) ((Boolean) obj).booleanValue(), (boolean) awS106S0400000_8.l1, (RecordConfig.Builder) awS106S0400000_8.l2, (C527600Kmc) awS106S0400000_8.l3, (C259800zU<String>) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849194, new AwS217S0300000_8((C19EG) awS106S0400000_8.l1, (Function0) awS106S0400000_8.l2, (String[]) awS106S0400000_8.l0, 21));
        c1397620mTQ.LJII(2131849193, new AwS217S0300000_8((C19EG) awS106S0400000_8.l1, (Function0) awS106S0400000_8.l3, (String[]) awS106S0400000_8.l0, 22));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        long j;
        Cursor cursor = (Cursor) obj;
        while (C0M4A.LIZIZ(cursor)) {
            AwemeDraft awemeDraftLIZ = C0MZJ.LIZ(cursor);
            if (!((C0M4E) awS106S0400000_8.l0).LJIIIIZZ || C0MZ9.LJII(awemeDraftLIZ)) {
                long j2 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("free_up_space"));
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    j = 0;
                }
                if (j >= 0) {
                    j2 = j;
                }
                Function1 function1 = (Function1) awS106S0400000_8.l1;
                if (function1 != null) {
                    if (((Boolean) function1.invoke(awemeDraftLIZ)).booleanValue()) {
                        ((C238400w2) awS106S0400000_8.l2).element += j2;
                        ((List) awS106S0400000_8.l3).add(awemeDraftLIZ);
                    }
                } else {
                    ((C238400w2) awS106S0400000_8.l2).element += j2;
                    ((List) awS106S0400000_8.l3).add(awemeDraftLIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0LBH((VideoPublishEditModel) obj, (C538890LBn) awS106S0400000_8.l0, (AwemeDraft) awS106S0400000_8.l1, (C538870LBl) awS106S0400000_8.l2, (Activity) awS106S0400000_8.l3, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C118300cf c118300cf = (C118300cf) awS106S0400000_8.l0;
        if (zBooleanValue) {
            View view = (View) awS106S0400000_8.l1;
            if (view != null) {
                view.performClick();
            }
            i = 2;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(System.currentTimeMillis());
            String strLIZJ = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            if (C540280LGw.LIZJ((Context) awS106S0400000_8.l3, (Bitmap) awS106S0400000_8.l2, strLIZJ) == null) {
                i = -1;
            } else {
                i = 1;
            }
        }
        c118300cf.element = i;
        return Integer.valueOf(((C118300cf) awS106S0400000_8.l0).element);
    }

    public static final Object invoke$2(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849194, new AwS217S0300000_8((C19EG) awS106S0400000_8.l1, (Function0) awS106S0400000_8.l2, (String[]) awS106S0400000_8.l0, 18));
        c1397620mTQ.LJII(2131849193, new AwS217S0300000_8((C19EG) awS106S0400000_8.l1, (Function0) awS106S0400000_8.l3, (String[]) awS106S0400000_8.l0, 19));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((Context) awS106S0400000_8.l0).getText(2131820711), new AwS374S0200000_8((VideoPublishEditModel) awS106S0400000_8.l2, (Function0) awS106S0400000_8.l1, 103));
        c1397620mTQ.LIZJ(1, ((Context) awS106S0400000_8.l0).getText(2131820710), new AwS374S0200000_8((VideoPublishEditModel) awS106S0400000_8.l2, (Function0) awS106S0400000_8.l3, 104));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        ((Function1) awS106S0400000_8.l0).invoke(obj);
        C568790MSn c568790MSn = (C568790MSn) awS106S0400000_8.l1;
        C19EG c19eg = (C19EG) awS106S0400000_8.l2;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS106S0400000_8.l3;
        c568790MSn.getClass();
        C0M5N c0m5n = C0M5N.LIZ;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModel);
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        bundle.putBoolean("enter_record_from_other_platform", false);
        bundle.putBoolean("extra_enter_from_live", false);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishService.createBundleParams()  bundle=");
        sbLIZ.append(bundle);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        Publish.PublishBundle = bundle;
        C0M5P c0m5p = new C0M5P(c19eg, bundle, null);
        c0m5n.getClass();
        C0M5N.LIZ(c0m5p);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131849194, new AwS217S0300000_8((C19EG) awS106S0400000_8.l0, (C19EG) awS106S0400000_8.l1, (Function0<Unit>) awS106S0400000_8.l2, (Function0<Unit>) 34));
        c1397620mTQ.LJII(2131849193, new AwS587S0100000_8((Function2) awS106S0400000_8.l3, (Function2<? super String, ? super Long, Unit>) 607));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        if (Intrinsics.LJFF(obj, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            ((InterfaceC1655610tBX) awS106S0400000_8.l0).LIZ();
            C786410Ut5.LJJJZ((FrameLayout) awS106S0400000_8.l2, (FrameLayout) awS106S0400000_8.l1);
            C1447800nmM.LIZIZ((C535470KzJ) awS106S0400000_8.l3).remove((C535470KzJ) awS106S0400000_8.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        ((Boolean) obj).booleanValue();
        if (((C1322110kVd) awS106S0400000_8.l0) != null) {
            C0MH7.LIZLLL((C19EG) awS106S0400000_8.l2, (C1322110kVd) awS106S0400000_8.l0, (VideoPublishEditModel) awS106S0400000_8.l1, (C09K7) awS106S0400000_8.l3);
        } else {
            C12ES.LIZLLL(2131839098, o.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS106S0400000_8 awS106S0400000_8, Object obj) {
        C19EG c19eg;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && (c19eg = (C19EG) awS106S0400000_8.l0) != null) {
            C443530HaJ c443530HaJ = new C443530HaJ(c19eg.getResources(), bitmap);
            c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, o.LIZ));
            ((C1322110kVd) awS106S0400000_8.l1).setImageDrawable(c443530HaJ);
            C09K7 c09k7 = (C09K7) awS106S0400000_8.l2;
            if (c09k7 != null) {
                c09k7.LJJLIIIJLLLLLLLZ(bitmap);
            }
            C565950MHp.LIZ((VideoPublishEditModel) awS106S0400000_8.l3);
        } else {
            C12ES.LIZLLL(2131839098, o.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, java.lang.Object] */
    public static final Object invoke$9(AwS106S0400000_8 awS106S0400000_8, Object obj) throws Throwable {
        CanvasVideoData canvasVideoData;
        String videoCoverPath;
        List<String> list;
        VideoPublishEditModel videoPublishEditModel;
        ((Boolean) obj).booleanValue();
        if (((C19EG) awS106S0400000_8.l0) != null) {
            if (C1429320nIY.LIZJ((VideoPublishEditModel) awS106S0400000_8.l1) && ((videoPublishEditModel = (VideoPublishEditModel) awS106S0400000_8.l1) == null || !C1429320nIY.LJ(videoPublishEditModel))) {
                C1443990ngD.LJIIJJI((VideoPublishEditModel) awS106S0400000_8.l1, (C1322110kVd) awS106S0400000_8.l2, (C19EG) awS106S0400000_8.l0, (C09K7) awS106S0400000_8.l3, null);
            } else {
                final VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS106S0400000_8.l1;
                final C19EG c19eg = (C19EG) awS106S0400000_8.l0;
                final C1322110kVd c1322110kVd = (C1322110kVd) awS106S0400000_8.l2;
                C0MH8 c0mh8 = C0MH8.LIZ;
                if (c0mh8.LJ(videoPublishEditModel2, -1)) {
                    C0MH7.LIZ(videoPublishEditModel2, c1322110kVd, c0mh8.LJII(videoPublishEditModel2, -1));
                } else {
                    C259800zU c259800zU = new C259800zU();
                    String str = null;
                    Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel2, false, null, false, 2);
                    if (pairLJJIIJZLJL != null) {
                        c259800zU.element = pairLJJIIJZLJL.getFirst();
                    }
                    CharSequence charSequence = (CharSequence) c259800zU.element;
                    if (charSequence != null && charSequence.length() != 0 && C2354709Kn.LIZIZ((String) c259800zU.element)) {
                        C0MH7.LIZ(videoPublishEditModel2, c1322110kVd, (String) c259800zU.element);
                    } else {
                        videoPublishEditModel2.generateVideoCoverPath(true, -2);
                        c259800zU.element = videoPublishEditModel2.getVideoCoverPath();
                        if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                            C1444180ngW.LIZIZ(videoPublishEditModel2, new AwS281S0300000_2(c1322110kVd, (C1322110kVd) videoPublishEditModel2, (VideoPublishEditModel) c259800zU, (C259800zU<String>) 2));
                        } else {
                            CanvasVideoData canvasVideoData2 = videoPublishEditModel2.getCanvasVideoData();
                            if ((canvasVideoData2 != null && C1444940nhk.LJII(canvasVideoData2)) || ((canvasVideoData = videoPublishEditModel2.getCanvasVideoData()) != null && C1444940nhk.LJIIL(canvasVideoData))) {
                                CanvasVideoData canvasVideoData3 = videoPublishEditModel2.getCanvasVideoData();
                                if (canvasVideoData3 != null && (list = canvasVideoData3.sourceInfo) != null && (!list.isEmpty()) && C2354709Kn.LIZIZ((String) ListProtector.get(list, 0))) {
                                    videoPublishEditModel2.setVideoCoverPath((String) ListProtector.get(list, 0));
                                    if (C493401w4.LIZ()) {
                                        c0mh8.LIZ(videoPublishEditModel2, new CoverNewItem(1001, videoPublishEditModel2.getVideoCoverPath(), 1, null, 0L, null, null, 120, null), false);
                                    }
                                    C0MH7.LIZ(videoPublishEditModel2, c1322110kVd, (String) ListProtector.get(list, 0));
                                }
                            } else if (videoPublishEditModel2.isMultiVideoEdit()) {
                                MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel2.getMultiEditVideoRecordData();
                                if (multiEditVideoRecordData != null) {
                                    multiEditVideoRecordData.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel2.getCreativeInfo());
                                }
                                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel2.getMultiEditVideoRecordData();
                                if (multiEditVideoRecordData2 != null) {
                                    str = multiEditVideoRecordData2.coverImagePath;
                                }
                                videoPublishEditModel2.setVideoCoverPath(str);
                                String strLJI = C1443400nfG.LJI(videoPublishEditModel2);
                                if (C1429320nIY.LIZJ(videoPublishEditModel2) && strLJI != null && (videoCoverPath = videoPublishEditModel2.getVideoCoverPath()) != null) {
                                    if (C493401w4.LIZ()) {
                                        C0MH8.LIZLLL(videoPublishEditModel2, strLJI, videoCoverPath);
                                    } else if (C2286708xd.LIZJ(strLJI)) {
                                        C09BH.LJIIIIZZ(new C0VSJ(videoCoverPath), C09BH.LJ(new C0VSJ(strLJI)));
                                    }
                                }
                                VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel2.getCurMultiEditVideoRecordData());
                                android.util.Pair<Integer, Integer> playInOutTime = videoPublishEditModel2.getCurMultiEditVideoRecordData().getPlayInOutTime();
                                vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).intValue() * LSPassThroughRecordSizeConfig.DEFAULT, ((Number) playInOutTime.second).intValue() * LSPassThroughRecordSizeConfig.DEFAULT);
                                final C118300cf c118300cf = new C118300cf();
                                c118300cf.element = (int) (videoPublishEditModel2.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
                                if (videoPublishEditModel2.isUseTimeReverseEffect()) {
                                    c118300cf.element = (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - c118300cf.element;
                                }
                                C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0MBT
                                    @Override // X.InterfaceC1478005qU
                                    public final void subscribe(C09AJ<Drawable> c09aj) {
                                        String str2;
                                        MultiEditVideoStatusRecordData multiEditVideoRecordData3;
                                        MultiEditVideoStatusRecordData multiEditVideoRecordData4;
                                        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$2");
                                        MultiEditVideoStatusRecordData multiEditVideoRecordData5 = videoPublishEditModel2.getMultiEditVideoRecordData();
                                        String str3 = null;
                                        if (multiEditVideoRecordData5 != null) {
                                            str2 = multiEditVideoRecordData5.coverImagePath;
                                        } else {
                                            str2 = null;
                                        }
                                        if (TextUtils.isEmpty(str2) && (multiEditVideoRecordData4 = videoPublishEditModel2.getMultiEditVideoRecordData()) != null) {
                                            multiEditVideoRecordData4.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel2.getCreativeInfo());
                                        }
                                        if (C493401w4.LIZ() && (multiEditVideoRecordData3 = videoPublishEditModel2.getMultiEditVideoRecordData()) != null) {
                                            C0MH8 c0mh82 = C0MH8.LIZ;
                                            VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                                            c0mh82.getClass();
                                            multiEditVideoRecordData3.coverImagePath = C0MH8.LJI(videoPublishEditModel3, 3);
                                        }
                                        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel2);
                                        c1456230nzx.LIZ.LJFF = c118300cf.element;
                                        c1456230nzx.LIZ(-1, c1322110kVd.getHeight());
                                        MultiEditVideoStatusRecordData multiEditVideoRecordData6 = videoPublishEditModel2.getMultiEditVideoRecordData();
                                        if (multiEditVideoRecordData6 != null) {
                                            str3 = multiEditVideoRecordData6.coverImagePath;
                                        }
                                        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                                        c1457050o1H.LIZIZ = str3;
                                        c1457050o1H.LJIILLIIL = 60;
                                        c1457050o1H.LJIIZILJ = Bitmap.CompressFormat.PNG;
                                        AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(c19eg, (C19482611Ke) c09aj, 179);
                                        C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
                                        c1457050o1H2.LJII = awS374S0200000_8;
                                        int iLIZIZ = C1457060o1I.LIZIZ(c1457050o1H2);
                                        if (iLIZIZ != 0) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("VEUtils.getVideoThumb return code=");
                                            sbLIZ.append(iLIZIZ);
                                            C201955140j.LJI("publish_page_get_cover_error", new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                                            c09aj.onComplete();
                                        }
                                        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$2");
                                    }
                                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0200000_2(c1322110kVd, videoPublishEditModel2, 7), new C09JN() { // from class: X.0MH5
                                    @Override // X.C09JN
                                    public final void accept(Object obj2) {
                                        C1C7U.LIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$4");
                                        C12ES.LIZLLL(2131839098, o.LIZ);
                                        C1C7U.LIZIZ("CoverExtKt@ad6c.loadMultiVideoEditCoverNew$4");
                                    }
                                });
                            } else {
                                C0MH7.LIZJ(c19eg, c1322110kVd, videoPublishEditModel2, null);
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS106S0400000_8(X.C19EG r3, X.C1322110kVd r4, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, X.C09K7 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 7: goto L13;
                case 8: goto L1e;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r1.l3 = r6
            r0 = 1
            goto Lf
        L1e:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r6
            r1.l3 = r5
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS106S0400000_8.<init>(X.19EG, X.0kVd, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.09K7, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0400000_8(C118300cf c118300cf, View view, Bitmap bitmap, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = view;
        this.l2 = bitmap;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0400000_8(C538890LBn c538890LBn, AwemeDraft awemeDraft, C538870LBl c538870LBl, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = c538890LBn;
        this.l1 = awemeDraft;
        this.l2 = c538870LBl;
        this.l3 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0400000_8(C0M4E c0m4e, C0M4E c0m4e2, Function1<? super AwemeDraft, Boolean> function1, C238400w2 c238400w2, List<AwemeDraft> list) {
        super(1);
        this.$t = list;
        this.l0 = c0m4e;
        this.l1 = c0m4e2;
        this.l2 = function1;
        this.l3 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0400000_8(InterfaceC1655610tBX interfaceC1655610tBX, FrameLayout frameLayout, FrameLayout frameLayout2, C535470KzJ c535470KzJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1655610tBX;
        this.l1 = frameLayout;
        this.l2 = frameLayout2;
        this.l3 = c535470KzJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0400000_8(C19EG c19eg, C19EG c19eg2, Function0<Unit> function0, Function0<Unit> function02, Function2<? super Boolean, ? super C0L9U, Unit> function2) {
        super(1);
        this.$t = function2;
        this.l0 = c19eg;
        this.l1 = c19eg2;
        this.l2 = function0;
        this.l3 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0400000_8(Context context, VideoPublishEditModel videoPublishEditModel, Function0 function0, Function0 function02, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = function0;
        this.l2 = videoPublishEditModel;
        this.l3 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0400000_8(MvChoosePhotoScene mvChoosePhotoScene, MvChoosePhotoScene mvChoosePhotoScene2, RecordConfig.Builder builder, C527600Kmc c527600Kmc, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = mvChoosePhotoScene;
        this.l1 = mvChoosePhotoScene2;
        this.l2 = builder;
        this.l3 = c527600Kmc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0400000_8(AwS601S0100000_22 awS601S0100000_22, C568790MSn c568790MSn, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS601S0100000_22;
        this.l1 = c568790MSn;
        this.l2 = c19eg;
        this.l3 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0400000_8(String[] strArr, String[] strArr2, C19EG c19eg, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = strArr;
        this.l1 = strArr2;
        this.l2 = c19eg;
        this.l3 = function0;
    }
}
