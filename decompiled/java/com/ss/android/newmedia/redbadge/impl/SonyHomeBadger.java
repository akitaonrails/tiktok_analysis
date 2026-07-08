package com.ss.android.newmedia.redbadge.impl;

import X.C0VFN;
import X.C0VFP;
import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class SonyHomeBadger implements C0VFN {
    public final Uri LIZ = UriProtector.parse("content://com.sonymobile.home.resourceprovider/badge");
    public AsyncQueryHandler LIZIZ;

    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    public static class SonyAsyncQueryHandler extends AsyncQueryHandler {

        public class SonyWorkerHandler extends AsyncQueryHandler.WorkerHandler {
            @Override // android.content.AsyncQueryHandler.WorkerHandler, android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("SonyHomeBadger$SonyAsyncQueryHandler$SonyWorkerHandler@f1a9.handleMessage");
                try {
                    super.handleMessage(message);
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1C7U.LIZIZ("SonyHomeBadger$SonyAsyncQueryHandler$SonyWorkerHandler@f1a9.handleMessage");
            }

            public SonyWorkerHandler(SonyAsyncQueryHandler sonyAsyncQueryHandler, Looper looper) {
                super(sonyAsyncQueryHandler, looper);
            }
        }

        public SonyAsyncQueryHandler(ContentResolver contentResolver) {
            super(contentResolver);
        }

        @Override // android.content.AsyncQueryHandler
        public final Handler createHandler(Looper looper) {
            return new SonyWorkerHandler(this, looper);
        }
    }

    public static void LIZJ(int i, ComponentName componentName, Context context) throws Throwable {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5PuWkdqY9ImN1dzr/1bA==", null)));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5PuWkdqY9ImN1dzr/1bA==", null)));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5PuWkdqY9ImN1dzr/1bA==", null));
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                    LIZLLL(i, componentName, context);
                } else {
                    LIZJ(i, componentName, context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new C0VFP(th.getMessage());
            }
        }
    }

    public final void LIZLLL(int i, ComponentName componentName, Context context) throws Throwable {
        if (i < 0) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new SonyAsyncQueryHandler(C786410Ut5.N3(context).getContentResolver()) { // from class: com.ss.android.newmedia.redbadge.impl.SonyHomeBadger.1
            };
        }
        String strLJJIJIL = C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5PuWkdqY9ImN1dzr/1bA==", null));
        String strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5PuWkdqY9ImN1dzr/1bA==", null));
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", strLJJIJIL);
        contentValues.put("activity_name", strLJJIJIIJIL);
        this.LIZIZ.startInsert(0, null, this.LIZ, contentValues);
    }
}
