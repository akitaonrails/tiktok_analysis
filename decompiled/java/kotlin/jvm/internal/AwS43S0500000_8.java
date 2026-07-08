package kotlin.jvm.internal;

import X.AbstractC214814194y;
import X.C05XL;
import X.C099F;
import X.C09AY;
import X.C0FQ1;
import X.C0FQS;
import X.C0L4A;
import X.C0L82;
import X.C13LP;
import X.C1447800nmM;
import X.C1697810uHb;
import X.C19A3;
import X.C238400w2;
import X.C259800zU;
import X.C534170KxD;
import X.C534440Kxe;
import X.C535470KzJ;
import X.C536540L2m;
import X.C537830L7l;
import X.C537850L7n;
import X.C537930L7v;
import X.C537990L8b;
import X.C575870MiH;
import X.C634930OvL;
import X.C786410Ut5;
import X.InterfaceC534480Kxi;
import android.content.Intent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabase;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS43S0500000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS43S0500000_8 awS43S0500000_8, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C536540L2m) awS43S0500000_8.l0).LJ().LIZIZ((List) awS43S0500000_8.l1, (Intent) awS43S0500000_8.l2, (Intent) awS43S0500000_8.l3, (C534170KxD) awS43S0500000_8.l4, null);
        } else {
            ((C534170KxD) awS43S0500000_8.l4).onMediaChooseFail("checkServiceInterceptApply -> need Intercept");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS43S0500000_8 awS43S0500000_8, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C634930OvL c634930OvL = (C634930OvL) awS43S0500000_8.l0;
            AsyncAVService asyncAVService = (AsyncAVService) awS43S0500000_8.l1;
            RecordConfig recordConfig = (RecordConfig) awS43S0500000_8.l2;
            MusicModel musicModel = (MusicModel) awS43S0500000_8.l3;
            c634930OvL.getClass();
            C575870MiH c575870MiH = new C575870MiH();
            c575870MiH.LIZ(recordConfig);
            recordConfig.setMusicModel(musicModel);
            c575870MiH.LIZ.setRecordConfig(recordConfig);
            c575870MiH.LIZ.setHasRecordEntrance(true);
            if (musicModel != null) {
                c575870MiH.LIZ.setMusicModel(musicModel);
            }
            c575870MiH.LIZ.setEnableLivePhoto(true);
            IRecordService.DefaultImpls.startAlbum$default(asyncAVService.uiService().recordService(), c634930OvL.LIZ, c575870MiH.LIZ, false, 4, null);
        } else {
            ((Function0) awS43S0500000_8.l4).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS43S0500000_8 awS43S0500000_8, Object obj) {
        InterfaceC534480Kxi interfaceC534480Kxi = (InterfaceC534480Kxi) obj;
        interfaceC534480Kxi.LIZLLL(new AwS587S0100000_8((C259800zU) awS43S0500000_8.l0, (C259800zU<MentionDataItem>) 639));
        interfaceC534480Kxi.LIZJ(new AwS286S0300000_8((C259800zU) awS43S0500000_8.l0, (C259800zU<CreativeLoadingDialog>) awS43S0500000_8.l1, (C05XL<String>) awS43S0500000_8.l2, (C534440Kxe) 7));
        interfaceC534480Kxi.LIZIZ(new AwS286S0300000_8((List) awS43S0500000_8.l3, (List<? extends MediaModel>) awS43S0500000_8.l2, (C534440Kxe) awS43S0500000_8.l4, (LiveRecordingsRoomDatabase) 8));
        interfaceC534480Kxi.LIZ(new AwS405S0200000_4((C05XL) awS43S0500000_8.l1, (C05XL<String>) awS43S0500000_8.l0, (C259800zU<CreativeLoadingDialog>) 34));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS43S0500000_8 awS43S0500000_8, Object obj) {
        if (Intrinsics.LJFF(obj, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            ((C19A3) awS43S0500000_8.l0).remove((NavigationScene) awS43S0500000_8.l1);
            C786410Ut5.LJJJZ((FrameLayout) awS43S0500000_8.l3, (FrameLayout) awS43S0500000_8.l2);
            C1447800nmM.LIZIZ((C535470KzJ) awS43S0500000_8.l4).remove((C535470KzJ) awS43S0500000_8.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS43S0500000_8 awS43S0500000_8, Object obj) {
        AVMusic aVMusic;
        String str;
        Boolean bool;
        String str2;
        String str3;
        C0FQS c0fqs = (C0FQS) obj;
        CreativeDialogWrapper creativeDialogWrapper = ((C0L4A) awS43S0500000_8.l0).LIZ;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null) {
            ArrayList<MediaItem> arrayListLIZ = C0FQ1.LIZ(nLETemplateModel);
            ArrayList<TextItem> arrayListLIZIZ = C0FQ1.LIZIZ(nLETemplateModel);
            List<C537990L8b> list = c0fqs.LIZLLL;
            if (!list.isEmpty()) {
                C537830L7l c537830L7l = (C537830L7l) awS43S0500000_8.l1;
                Iterator<MediaItem> it2 = c537830L7l.LIZJ.iterator();
                int i = 0;
                while (true) {
                    MediaItem mediaItem = null;
                    if (it2.hasNext()) {
                        MediaItem next = it2.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            MediaItem mediaItem2 = next;
                            Iterator<MediaItem> it3 = arrayListLIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                MediaItem next2 = it3.next();
                                if (Intrinsics.LJFF(next2.materialId, mediaItem2.materialId)) {
                                    mediaItem = next2;
                                    break;
                                }
                            }
                            MediaItem mediaItem3 = mediaItem;
                            String str4 = "";
                            if (mediaItem3 == null) {
                                ArrayList<MediaItem> arrayList = c537830L7l.LIZJ;
                                C537990L8b c537990L8b = (C537990L8b) C13LP.LJJJLZIJ(i % list.size(), list);
                                if (c537990L8b != null && (str3 = c537990L8b.LJ) != null) {
                                    str4 = str3;
                                }
                                ListProtector.set(arrayList, i, MediaItem.LIZ(mediaItem2, null, 0L, 0L, false, 0.0f, 0, 0, 0L, str4, 0L, 0.0f, null, null, null, 0.0f, 1040383));
                            } else {
                                ArrayList<MediaItem> arrayList2 = c537830L7l.LIZJ;
                                C537990L8b c537990L8b2 = (C537990L8b) C13LP.LJJJLZIJ(i % list.size(), list);
                                if (c537990L8b2 != null && (str2 = c537990L8b2.LJ) != null) {
                                    str4 = str2;
                                }
                                ListProtector.set(arrayList2, i, MediaItem.LIZ(mediaItem2, null, mediaItem3.targetStartTime, mediaItem3.targetEndTime, false, 0.0f, mediaItem3.width, mediaItem3.height, 0L, str4, 0L, mediaItem3.cropScale, mediaItem3.crop, null, null, 0.0f, 939001));
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        CutsameDataItem cutsameDataItem = ((C537830L7l) awS43S0500000_8.l1).LIZLLL;
                        if (cutsameDataItem.musicPostUnavailable == null) {
                            C537850L7n c537850L7n = c0fqs.LJIILL;
                            if (c537850L7n != null) {
                                bool = c537850L7n.LIZJ;
                            } else {
                                bool = null;
                            }
                            cutsameDataItem.musicPostUnavailable = bool;
                        }
                        ((C238400w2) awS43S0500000_8.l2).element = ((ITemplateService) awS43S0500000_8.l3).LJIIIIZZ(((C0FQS) awS43S0500000_8.l4).LJIIJ);
                        C537850L7n c537850L7n2 = ((C0FQS) awS43S0500000_8.l4).LJIILL;
                        if (c537850L7n2 != null) {
                            aVMusic = c537850L7n2.LIZLLL;
                            str = c537850L7n2.LJ;
                        } else {
                            aVMusic = null;
                            str = null;
                        }
                        C537930L7v c537930L7v = new C537930L7v(((C537830L7l) awS43S0500000_8.l1).LIZJ, null, arrayListLIZIZ, 2);
                        Intent intent = new Intent();
                        c537930L7v.LIZ(intent);
                        C537830L7l c537830L7l2 = (C537830L7l) awS43S0500000_8.l1;
                        C0L4A c0l4a = (C0L4A) awS43S0500000_8.l0;
                        C238400w2 c238400w2 = (C238400w2) awS43S0500000_8.l2;
                        if (!intent.hasExtra("key_short_video_context")) {
                            intent.putExtra("key_short_video_context", c537830L7l2.LIZIZ);
                        }
                        intent.putExtra("cut_template_aspect_ratio", String.valueOf(nLETemplateModel.getCanvasRatio()));
                        intent.putExtra("cut_template_width", (int) nLETemplateModel.getTemplateCanvasSize().getWidth());
                        intent.putExtra("cut_template_height", (int) nLETemplateModel.getTemplateCanvasSize().getHeight());
                        intent.putExtra("cut_compress_start_time", c0l4a.LIZLLL);
                        intent.putExtra("arg_template_nle_model_cached_id", c238400w2.element);
                        C537830L7l c537830L7l3 = (C537830L7l) awS43S0500000_8.l1;
                        new C0L82(c537830L7l3.LIZ, 10110, -1, intent, c537830L7l3.LIZLLL, aVMusic, str).LIZ();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0500000_8(C259800zU c259800zU, C099F c099f, C534440Kxe c534440Kxe, List list, LiveRecordingsRoomDatabase liveRecordingsRoomDatabase, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c099f;
        this.l2 = c534440Kxe;
        this.l3 = list;
        this.l4 = liveRecordingsRoomDatabase;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0500000_8(C536540L2m c536540L2m, C536540L2m c536540L2m2, List<? extends MediaModel> list, Intent intent, Intent intent2, C534170KxD c534170KxD) {
        super(1);
        this.$t = c534170KxD;
        this.l0 = c536540L2m;
        this.l1 = c536540L2m2;
        this.l2 = list;
        this.l3 = intent;
        this.l4 = intent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0500000_8(C0L4A c0l4a, C537830L7l c537830L7l, C238400w2 c238400w2, ITemplateService iTemplateService, C0FQS c0fqs, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0l4a;
        this.l1 = c537830L7l;
        this.l2 = c238400w2;
        this.l3 = iTemplateService;
        this.l4 = c0fqs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS43S0500000_8(C634930OvL c634930OvL, C634930OvL c634930OvL2, AsyncAVService asyncAVService, RecordConfig recordConfig, MusicModel musicModel, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c634930OvL;
        this.l1 = c634930OvL2;
        this.l2 = asyncAVService;
        this.l3 = recordConfig;
        this.l4 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0500000_8(AbstractC214814194y abstractC214814194y, NavigationScene navigationScene, FrameLayout frameLayout, FrameLayout frameLayout2, C535470KzJ c535470KzJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC214814194y;
        this.l1 = navigationScene;
        this.l2 = frameLayout;
        this.l3 = frameLayout2;
        this.l4 = c535470KzJ;
    }
}
