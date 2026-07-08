package kotlin.jvm.internal;

import X.AbstractC577050MkB;
import X.C09AY;
import X.C09HN;
import X.C0L2T;
import X.C0LDE;
import X.C13LP;
import X.C15438062q;
import X.C534100Kx6;
import X.C536510L2j;
import X.C576730Mjf;
import android.content.Intent;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS1S0602000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0602000_8 awS1S0602000_8, Object obj) throws Throwable {
        LayoutMediaType layoutMediaType;
        String strLJFF;
        MediaModel mediaModel;
        LayoutMediaType layoutMediaType2;
        ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
        C0LDE c0lde = ((C0L2T) awS1S0602000_8.l0).LLJ;
        if (c0lde != null) {
            c0lde.LJIIIIZZ();
        }
        ((MediaChooseResultListener) awS1S0602000_8.l1).onMediaChooseSuccess();
        C0L2T c0l2t = (C0L2T) awS1S0602000_8.l0;
        Intent intent = (Intent) awS1S0602000_8.l2;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS1S0602000_8.l3;
        int i = awS1S0602000_8.i6;
        int i2 = awS1S0602000_8.i7;
        ArrayList<MediaModel> arrayList2 = (ArrayList) awS1S0602000_8.l4;
        AbstractC577050MkB abstractC577050MkB = (AbstractC577050MkB) awS1S0602000_8.l5;
        c0l2t.getClass();
        MediaModel mediaModel2 = (MediaModel) C13LP.LJJJLL(arrayList);
        if (mediaModel2 != null) {
            mediaModel2.aigcInfo = C0L2T.LJFF(arrayList2, null);
        }
        intent.putParcelableArrayListExtra("key_choose_media_data", arrayList);
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        LayoutApplyFrom layoutApplyFrom = LayoutApplyFrom.ALBUM;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (MediaModel mediaModel3 : arrayList2) {
            if (mediaModel3 != null) {
                if (mediaModel3.LJIIJJI()) {
                    layoutMediaType2 = LayoutMediaType.LIVE_PHOTO;
                } else if (mediaModel3.LJIIJ()) {
                    layoutMediaType2 = LayoutMediaType.PHOTO;
                } else {
                    layoutMediaType2 = LayoutMediaType.VIDEO;
                }
                arrayList3.add(layoutMediaType2);
                arrayList4.add(LayoutMediaSource.UPLOAD);
            }
        }
        String strLIZLLL = abstractC577050MkB.LIZLLL();
        List listLJJJJLI = C13LP.LJJJJLI(arrayList2);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
        while (it2.hasNext()) {
            arrayList5.add(C576730Mjf.LJFF((MediaModel) it2.next(), shortVideoContext));
        }
        ArrayList arrayListLIZ = C09HN.LIZ(arrayList5);
        MediaModel mediaModel4 = (MediaModel) C13LP.LJJJLL(arrayList);
        if (mediaModel4 != null && mediaModel4.LJIIJJI()) {
            layoutMediaType = LayoutMediaType.LIVE_PHOTO;
        } else {
            MediaModel mediaModel5 = (MediaModel) C13LP.LJJJLL(arrayList);
            if (mediaModel5 != null && mediaModel5.LJIIJ()) {
                layoutMediaType = LayoutMediaType.PHOTO;
            } else {
                layoutMediaType = LayoutMediaType.VIDEO;
            }
        }
        MediaModel mediaModel6 = (MediaModel) C13LP.LJJJLL(arrayList);
        if (mediaModel6 != null) {
            strLJFF = mediaModel6.LJFF();
        } else {
            strLJFF = null;
        }
        List listLJJJJLI2 = C13LP.LJJJJLI(arrayList2);
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI2, 10));
        for (MediaModel mediaModel7 : (ArrayList) listLJJJJLI2) {
            TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension();
            timeSpeedModelExtension.setDuration(C576730Mjf.LJIIIIZZ(mediaModel7));
            arrayList6.add(timeSpeedModelExtension);
        }
        creativeModel.cameraLayoutModel = new CameraLayoutModel(true, strLIZLLL, layoutApplyFrom, arrayList3, arrayList4, arrayListLIZ, null, layoutMediaType, strLJFF, null, C09HN.LIZ(arrayList6));
        if (arrayList.size() == 1 && (mediaModel = (MediaModel) C13LP.LJJJLL(arrayList)) != null && mediaModel.LJIIJJI()) {
            shortVideoContext.creativeModel.livePhotoModel = new LivePhotoModel(LivePhotoPreviewMode.LOOP, null, C13LP.LJJJJLI(arrayList), null, null, true, false, 0, 0L, C536510L2j.LIZ().livePhotoLoopCount, null, 1498, null);
        } else {
            shortVideoContext.creativeModel.livePhotoModel = null;
        }
        c0l2t.LJIIIIZZ(i, i2, intent, arrayList, arrayList2, shortVideoContext);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS1S0602000_8 r22, java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S0602000_8.invoke$1(kotlin.jvm.internal.AwS1S0602000_8, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0602000_8(C0L2T c0l2t, C534100Kx6 c534100Kx6, Intent intent, ShortVideoContext shortVideoContext, int i, int i2, ArrayList arrayList, AbstractC577050MkB abstractC577050MkB, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c0l2t;
        this.l1 = c534100Kx6;
        this.l2 = intent;
        this.l3 = shortVideoContext;
        this.i6 = i;
        this.i7 = i2;
        this.l4 = arrayList;
        this.l5 = abstractC577050MkB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0602000_8(C0L2T c0l2t, C534100Kx6 c534100Kx6, Intent intent, ShortVideoContext shortVideoContext, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c0l2t;
        this.l1 = c534100Kx6;
        this.l2 = intent;
        this.l3 = shortVideoContext;
        this.i6 = i;
        this.i7 = i2;
        this.l4 = arrayList;
        this.l5 = arrayList2;
    }
}
