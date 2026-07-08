package com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import X.C054G;
import X.C098N;
import X.C0LAB;
import X.C0MJO;
import X.C0PEM;
import X.C0VSJ;
import X.C0VSV;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2259271Dbp;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C356901a3;
import X.C443120HZe;
import X.C525670KjV;
import X.C528210Knb;
import X.C530180Kqm;
import X.C530690Krb;
import X.C537520L6g;
import X.C560460LyW;
import X.InterfaceC522520KeQ;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPlaygroundAIGCChooseResultImpl implements InterfaceC522520KeQ, DefaultLifecycleObserver, GenericLifecycleObserver {
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

    public AIPlaygroundAIGCChooseResultImpl(Activity activity) {
        this.LL = activity;
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

    public final void LIZLLL(String str, String str2) {
        int i;
        int i2;
        Bitmap bitmapLIZJ;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = options.outWidth;
        Throwable th = null;
        if (i3 > 0 && (i = options.outHeight) > 0) {
            if (i <= 4096 && i3 <= 4096) {
                i2 = 1;
            } else {
                int i4 = i / 2;
                int i5 = i3 / 2;
                i2 = 1;
                while (i4 / i2 >= 4096 && i5 / i2 >= 4096) {
                    i2 *= 2;
                }
            }
            options.inSampleSize = i2;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            if (bitmapDecodeFile != null) {
                try {
                    int iLJFF = new C2259271Dbp(str).LJFF(1);
                    if (iLJFF != 3) {
                        if (iLJFF != 6) {
                            if (iLJFF != 8) {
                                bitmapLIZJ = bitmapDecodeFile;
                            } else {
                                bitmapLIZJ = LIZJ(bitmapDecodeFile, 270.0f);
                            }
                        } else {
                            bitmapLIZJ = LIZJ(bitmapDecodeFile, 90.0f);
                        }
                    } else {
                        bitmapLIZJ = LIZJ(bitmapDecodeFile, 180.0f);
                    }
                    C0VSJ c0vsj = new C0VSJ(str2);
                    File parentFile = c0vsj.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    C0VSV c0vsv = new C0VSV(c0vsj);
                    try {
                        bitmapLIZJ.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                        C2107108Nh.LIZ(c0vsv, null);
                        if (bitmapLIZJ != bitmapDecodeFile && !bitmapDecodeFile.isRecycled()) {
                            bitmapDecodeFile.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                        }
                        if (!bitmapDecodeFile.isRecycled()) {
                            bitmapDecodeFile.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        try {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(c0vsv, th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    if (!bitmapDecodeFile.isRecycled()) {
                        bitmapDecodeFile.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                    }
                    throw th6;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to decode bitmap: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        String str;
        int i3;
        boolean z;
        String stringExtra;
        String stringExtra2;
        if (i != 10010) {
            return;
        }
        CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            return;
        }
        int i4 = C530180Kqm.LIZIZ;
        C443120HZe c443120HZeLIZ = C530180Kqm.LIZ(this.LL, parcelableArrayListExtra, 0L, -1L);
        ((Boolean) c443120HZeLIZ.getFirst()).booleanValue();
        int iIntValue = ((Number) c443120HZeLIZ.getSecond()).intValue();
        long jLongValue = ((Number) c443120HZeLIZ.getThird()).longValue();
        String strLIZ = C560460LyW.LIZ(iIntValue, parcelableArrayListExtra.size() - iIntValue);
        boolean z2 = true;
        if (parcelableArrayListExtra.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        int i5 = 0;
        if (iIntValue > 0) {
            i3 = iIntValue;
        } else {
            i3 = 0;
        }
        int size = parcelableArrayListExtra.size() - iIntValue;
        if (parcelableArrayListExtra.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C528210Knb c528210Knb = new C528210Knb(null, strLIZ, str, i3, size, strLIZ, z, C525670KjV.LIZ(parcelableArrayListExtra), z2, intent.getBooleanExtra("is_pip", false), intent.getBooleanExtra("Key_replace_item", false), C530690Krb.LIZ(parcelableArrayListExtra), parcelableArrayListExtra, 0 == true ? 1 : 0, 8192);
        if (jLongValue > 0) {
            i5 = (int) jLongValue;
        }
        c528210Knb.LIZIZ(i5);
        C0LAB c0lab = c528210Knb.LIZIZ;
        try {
            stringExtra = intent.getStringExtra("shoot_way");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str2 = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        c0lab.LJ("shoot_way", stringExtra);
        c0lab.LJ("creation_id", C537520L6g.LIZ(intent).getCreationId());
        c0lab.LJ("creation_id", C537520L6g.LIZ(intent).getCreationId());
        c0lab.LJ("upload_method", "click_button");
        ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
        if (shortVideoContext != null) {
            C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
        }
        try {
            String stringExtra3 = intent.getStringExtra("ai_video_tool_name");
            if (stringExtra3 != null) {
                str2 = stringExtra3;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c0lab.LJ("ai_video_tool_name", str2);
        c0lab.LIZ(1, "is_from_edit_tab");
        c0lab.LJ("edit_tab_entrance", "ai_video");
        try {
            stringExtra2 = intent.getStringExtra("upload_next_method");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra2 = null;
        }
        c0lab.LJ("upload_next_method", stringExtra2);
        c528210Knb.LIZ();
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C098N(parcelableArrayListExtra, creativeInfoLIZ, this, intent, i, i2, null), 3);
    }
}
