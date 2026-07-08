package com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import X.AbstractC1387200mCc;
import X.C054G;
import X.C098200Yq;
import X.C0CHQ;
import X.C0MI0;
import X.C0PEM;
import X.C0VSJ;
import X.C0VSV;
import X.C0WZX;
import X.C1388190mED;
import X.C13LP;
import X.C189200o6;
import X.C1906580ziK;
import X.C198H;
import X.C19EG;
import X.C20622515mp;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2259271Dbp;
import X.C2296808zG;
import X.C2296908zH;
import X.C2298208zU;
import X.C23250099c;
import X.C2471909mP;
import X.C2472509mV;
import X.C356901a3;
import X.C537520L6g;
import X.InterfaceC20597015ii;
import X.InterfaceC522520KeQ;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EditorProAIGCChooseResultImpl implements InterfaceC522520KeQ, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Activity LL;
    public final C054G LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public EditorProAIGCChooseResultImpl(Activity activity) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        LifecycleOwner lifecycleOwnerLJIJ;
        Lifecycle lifecycle;
        this.LL = activity;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (lifecycleOwnerLJIJ = C20622515mp.LJIJ(c19egLIZIZ)) != null && (lifecycle = lifecycleOwnerLJIJ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C2296808zG.LIZJ(this.LLILLJJLI, null);
    }

    public final Bitmap LIZJ(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) throws Throwable {
        MediaModel mediaModel;
        boolean z;
        Bundle extras;
        InterfaceC20597015ii interfaceC20597015iiLIZJ;
        Bitmap bitmapDecodeBitmap;
        if (i != 10008) {
            return;
        }
        CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && (mediaModel = (MediaModel) C13LP.LJJJLL(parcelableArrayListExtra)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2298208zU.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfoLIZ, C0MI0.EDITOR_PRO, null, 12));
            sbLIZ.append("reference_");
            sbLIZ.append(mediaModel.id);
            sbLIZ.append(".jpg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strLJIJ = C2471909mP.LJIJ(mediaModel);
            String str = mediaModel.mimeType;
            if (!Intrinsics.LJFF(str, "image/heif") && !Intrinsics.LJFF(str, "image/heic")) {
                z = false;
            } else {
                z = true;
            }
            try {
                if (z) {
                    bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new C0VSJ(strLJIJ)));
                } else {
                    bitmapDecodeBitmap = BitmapFactory.decodeFile(strLJIJ);
                }
                int iLJFF = new C2259271Dbp(strLJIJ).LJFF(1);
                if (iLJFF != 3) {
                    if (iLJFF != 6) {
                        if (iLJFF == 8) {
                            bitmapDecodeBitmap = LIZJ(bitmapDecodeBitmap, 270.0f);
                        }
                    } else {
                        bitmapDecodeBitmap = LIZJ(bitmapDecodeBitmap, 90.0f);
                    }
                } else {
                    bitmapDecodeBitmap = LIZJ(bitmapDecodeBitmap, 180.0f);
                }
                C0VSV c0vsv = new C0VSV(new C0VSJ(strLIZIZ));
                try {
                    bitmapDecodeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                    C2107108Nh.LIZ(c0vsv, null);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                    C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C2472509mV(this, strLJIJ, strLIZIZ, null), 3);
                                    intent.putExtra("key_ep_aigc_selected_image", strLIZIZ);
                                    extras = intent.getExtras();
                                    if (extras != null) {
                                        interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL);
                                        if (interfaceC20597015iiLIZJ == null) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    C2204961BRm.LJIIL(i2, this.LL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3ST0vyanQItB8qzEf4AgyPDND915Z+v6m+iIeYVUEI=", null));
                                    this.LL.finish();
                                    C20622515mp.LIZ(this.LL, R.anim.a8);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C2472509mV(this, strLJIJ, strLIZIZ, null), 3);
            intent.putExtra("key_ep_aigc_selected_image", strLIZIZ);
            try {
                extras = intent.getExtras();
                if (extras != null && extras.getBoolean("key_show_editor_pro_aigc_photo_entrance", false)) {
                    interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL);
                    if (interfaceC20597015iiLIZJ == null && (interfaceC20597015iiLIZJ.LC() instanceof SelectMaterialScene)) {
                        C198H c198hLC = interfaceC20597015iiLIZJ.LC();
                        if (c198hLC != null) {
                            c198hLC.setResult(i, intent);
                        }
                        C198H c198hLC2 = interfaceC20597015iiLIZJ.LC();
                        if (c198hLC2 != null) {
                            c198hLC2.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2204961BRm.LJIIL(i2, this.LL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3ST0vyanQItB8qzEf4AgyPDND915Z+v6m+iIeYVUEI=", null));
            this.LL.finish();
            C20622515mp.LIZ(this.LL, R.anim.a8);
        }
    }
}
