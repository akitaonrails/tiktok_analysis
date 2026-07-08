package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C816300W0m;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.app.job.JobInfo;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class JobSchedulerTriggerTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JobSchedulerTriggerTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        JobInfo jobInfo;
        try {
            for (String str : C816300W0m.LIZIZ.getAllKey()) {
                if (!C816300W0m.LIZ.contains(str)) {
                    Parcel parcelObtain = Parcel.obtain();
                    byte[] bytes = C816300W0m.LIZIZ.getBytes(str, new byte[0]);
                    parcelObtain.unmarshall(bytes, 0, bytes.length);
                    parcelObtain.setDataPosition(0);
                    Parcelable parcelable = parcelObtain.readParcelable(JobInfo.class.getClassLoader());
                    if (parcelable instanceof JobInfo) {
                        jobInfo = (JobInfo) parcelable;
                    } else {
                        jobInfo = null;
                    }
                    parcelObtain.recycle();
                    if (jobInfo != null) {
                        C844470XAv.LIZ.getClass();
                        C816300W0m.LIZLLL(C844470XAv.LIZ(), str, jobInfo);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
