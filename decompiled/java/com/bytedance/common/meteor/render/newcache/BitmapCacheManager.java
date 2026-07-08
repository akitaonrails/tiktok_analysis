package com.bytedance.common.meteor.render.newcache;

import X.AbstractC1396700mRw;
import X.C1384310m7x;
import X.C1384750m8f;
import X.C1385020m96;
import X.C1396710mRx;
import X.C1396730mRz;
import X.C1396740mS0;
import X.C1396750mS1;
import X.C1396760mS2;
import X.C13LE;
import X.C19719512Dh;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1384330m7z;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class BitmapCacheManager {
    public static HandlerThread LIZ;
    public static CacheHandler LIZIZ;
    public static C1396740mS0 LIZJ;
    public static InterfaceC1384330m7z LIZLLL;
    public static final HashMap<InterfaceC1384330m7z, C1396730mRz> LJ = new HashMap<>();
    public static C1385020m96 LJFF = C1385020m96.LIZ;
    public static boolean LJI;

    public static final class CacheHandler extends BPEAHandler {
        public CacheHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1396750mS1 c1396750mS1;
            String str;
            C1396750mS1 c1396750mS12;
            C1396750mS1 c1396750mS13;
            C1384310m7x c1384310m7x;
            Bitmap bitmap;
            Bitmap bitmap2;
            C1C7U.LIZ("BitmapCacheManager$CacheHandler@d8a9.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                C1396740mS0 c1396740mS0 = BitmapCacheManager.LIZJ;
                                if (c1396740mS0 != null) {
                                    c1396740mS0.LIZJ.clear();
                                    c1396740mS0.LIZIZ.clear();
                                }
                                BitmapCacheManager.LJ.clear();
                                removeCallbacksAndMessages(null);
                                getLooper().quit();
                            }
                        } else {
                            C1396740mS0 c1396740mS02 = BitmapCacheManager.LIZJ;
                            if (c1396740mS02 != null) {
                                c1396740mS02.LIZJ.clear();
                                c1396740mS02.LIZIZ.clear();
                            }
                        }
                    } else {
                        C1396740mS0 c1396740mS03 = BitmapCacheManager.LIZJ;
                        if (c1396740mS03 != null) {
                            c1396740mS03.LIZJ.clear();
                            c1396740mS03.LIZIZ.clear();
                        }
                    }
                } else {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if (messageObj != null) {
                        C1396750mS1 c1396750mS14 = (C1396750mS1) messageObj;
                        C1396740mS0 c1396740mS04 = BitmapCacheManager.LIZJ;
                        if (c1396740mS04 != null && (bitmap2 = c1396750mS14.LIZIZ) != null && !bitmap2.isRecycled()) {
                            HashMap<String, C1396750mS1> map = c1396740mS04.LIZJ;
                            String str2 = c1396750mS14.LJI;
                            if (map != null) {
                                if (map.containsKey(str2)) {
                                    c1396750mS14.LJII--;
                                }
                                if (c1396750mS14.LJII <= 0) {
                                    HashMap<String, C1396750mS1> map2 = c1396740mS04.LIZJ;
                                    String str3 = c1396750mS14.LJI;
                                    if (map2 != null) {
                                        C19719512Dh.LIZJ(map2).remove(str3);
                                        C1396760mS2 c1396760mS2 = c1396740mS04.LIZIZ.get(Integer.valueOf(bitmap2.getWidth()));
                                        if (c1396760mS2 != null) {
                                            HashMap<String, C1396750mS1> map3 = c1396760mS2.LIZIZ;
                                            String str4 = c1396750mS14.LJI;
                                            if (map3 != null) {
                                                if (!map3.containsKey(str4)) {
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                                            }
                                        } else {
                                            c1396760mS2 = new C1396760mS2();
                                            c1396740mS04.LIZIZ.put(Integer.valueOf(bitmap2.getWidth()), c1396760mS2);
                                        }
                                        String str5 = c1396750mS14.LJI;
                                        if (str5 != null) {
                                            c1396760mS2.LIZIZ.put(str5, c1396750mS14);
                                            c1396760mS2.LIZ += bitmap2.getAllocationByteCount();
                                            c1396740mS04.LIZ += (long) bitmap2.getAllocationByteCount();
                                            while (c1396740mS04.LIZ >= c1396740mS04.LIZLLL) {
                                                Map.Entry<Integer, C1396760mS2> entryPollLastEntry = c1396740mS04.LIZIZ.pollLastEntry();
                                                if (entryPollLastEntry != null) {
                                                    c1396740mS04.LIZ -= (long) entryPollLastEntry.getValue().LIZ;
                                                    C13LE.LIZ(C1396740mS0.class).LJI();
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("pool is full, clear one node, cursize:");
                                                    sbLIZ.append(c1396740mS04.LIZ);
                                                    C2188811AlT.LIZIZ(sbLIZ);
                                                }
                                            }
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.common.meteor.render.newcache.model.DrawingCache");
                    }
                }
            } else {
                Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                if (messageObj2 != null) {
                    Pair pair = (Pair) messageObj2;
                    AbstractC1396700mRw<?> abstractC1396700mRw = (AbstractC1396700mRw) pair.getFirst();
                    C1384750m8f c1384750m8f = (C1384750m8f) pair.getSecond();
                    String strLJJIL = abstractC1396700mRw.LJJIL(c1384750m8f);
                    if ((abstractC1396700mRw.LLJILJILJ == null || (c1396750mS12 = abstractC1396700mRw.LLJILJILJ) == null || c1396750mS12.LIZIZ == null || (((c1396750mS13 = abstractC1396700mRw.LLJILJILJ) != null && (bitmap = c1396750mS13.LIZIZ) != null && bitmap.isRecycled()) || (c1384310m7x = (C1384310m7x) abstractC1396700mRw.LJ()) == null || c1384310m7x.LJIIJ)) && !TextUtils.isEmpty(strLJJIL)) {
                        C1384310m7x c1384310m7x2 = (C1384310m7x) abstractC1396700mRw.LJ();
                        if (c1384310m7x2 != null && c1384310m7x2.LJIIJ) {
                            abstractC1396700mRw.LJIL(c1384750m8f);
                        }
                        try {
                            C1396740mS0 c1396740mS05 = BitmapCacheManager.LIZJ;
                            if (c1396740mS05 != null && (c1396750mS1 = c1396740mS05.LIZ(abstractC1396700mRw, strLJJIL)) != null) {
                                C1396730mRz c1396730mRz = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
                                if (c1396730mRz != null) {
                                    c1396730mRz.LIZ++;
                                }
                            } else {
                                c1396750mS1 = new C1396750mS1();
                                C1396730mRz c1396730mRz2 = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
                                if (c1396730mRz2 != null) {
                                    c1396730mRz2.LIZIZ++;
                                }
                            }
                            if (u.LJIJI(strLJJIL, c1396750mS1.LJI, false) && ((int) abstractC1396700mRw.LJIIL()) == c1396750mS1.LJ && ((int) abstractC1396700mRw.LJI()) == c1396750mS1.LJFF) {
                                C1396730mRz c1396730mRz3 = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
                                if (c1396730mRz3 != null) {
                                    c1396730mRz3.LIZJ++;
                                }
                            } else {
                                c1396750mS1.LIZ((int) abstractC1396700mRw.LJIIL(), (int) abstractC1396700mRw.LJI());
                                if (c1396750mS1.LIZIZ == null) {
                                    C1396730mRz c1396730mRz4 = BitmapCacheManager.LJ.get(BitmapCacheManager.LIZLLL);
                                    if (c1396730mRz4 != null) {
                                        c1396730mRz4.LJI++;
                                    }
                                } else {
                                    ((C1396710mRx) abstractC1396700mRw).LIZIZ(c1396750mS1.LIZ, c1384750m8f);
                                    c1396750mS1.LJI = strLJJIL;
                                }
                            }
                            C1384310m7x c1384310m7x3 = (C1384310m7x) abstractC1396700mRw.LJ();
                            if (c1384310m7x3 != null && c1384310m7x3.LJIIJ) {
                                C1384310m7x c1384310m7x4 = (C1384310m7x) abstractC1396700mRw.LJ();
                                if (c1384310m7x4 != null) {
                                    c1384310m7x4.LJIIJ = false;
                                }
                                c1384750m8f.LIZ(1800);
                            }
                            abstractC1396700mRw.LLJILJILJ = c1396750mS1;
                            C1396740mS0 c1396740mS06 = BitmapCacheManager.LIZJ;
                            if (c1396740mS06 != null && (str = c1396750mS1.LJI) != null) {
                                if (!c1396740mS06.LIZJ.containsKey(str)) {
                                    c1396740mS06.LIZJ.put(str, c1396750mS1);
                                }
                                c1396750mS1.LJII++;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (OutOfMemoryError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<com.bytedance.common.meteor.render.draw.snapshot.BitmapSnapshotDrawItem<*>, com.bytedance.common.meteor.control.DanmakuConfig>");
                }
            }
            C1C7U.LIZIZ("BitmapCacheManager$CacheHandler@d8a9.handleMessage");
        }
    }

    public static void LIZ(C1396750mS1 c1396750mS1) {
        CacheHandler cacheHandler;
        Message messageObtainMessage;
        if (c1396750mS1 != null && (cacheHandler = LIZIZ) != null && (messageObtainMessage = cacheHandler.obtainMessage(2, c1396750mS1)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public static void LIZJ(InterfaceC1384330m7z interfaceC1384330m7z) throws JSONException {
        HashMap<InterfaceC1384330m7z, C1396730mRz> map = LJ;
        C1396730mRz c1396730mRz = map.get(interfaceC1384330m7z);
        if (c1396730mRz != null) {
            C1385020m96 c1385020m96 = LJFF;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cache_hit", c1396730mRz.LIZ);
            jSONObject.put("bitmap_complete_reuse", c1396730mRz.LIZJ);
            jSONObject.put("cache_miss", c1396730mRz.LIZIZ);
            jSONObject.put("cache_on_screen", c1396730mRz.LIZLLL);
            jSONObject.put("draw_cache_miss", c1396730mRz.LJ);
            jSONObject.put("max_frame_miss", c1396730mRz.LJFF);
            jSONObject.put("bitmap_fault", c1396730mRz.LJI);
            c1385020m96.getClass();
            C786410Ut5.J3(jSONObject);
        }
        if (Intrinsics.LJFF(LIZLLL, interfaceC1384330m7z)) {
            LIZLLL = null;
        }
        map.remove(interfaceC1384330m7z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r8, X.InterfaceC1384330m7z r9, X.C1384750m8f r10) {
        /*
            X.0m9D r0 = r10.LIZLLL
            boolean r0 = r0.LJIIL
            if (r0 != 0) goto L7
            return
        L7:
            X.0m8g r0 = r10.LJIIIZ
            X.0m96 r0 = r0.LIZLLL
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LJFF = r0
            boolean r0 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LJI
            if (r0 != 0) goto L74
            X.0mS0 r0 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZJ
            r6 = 10
            if (r0 != 0) goto L4c
            if (r8 == 0) goto L42
            android.app.ActivityManager$MemoryInfo r7 = new android.app.ActivityManager$MemoryInfo
            r7.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r3 = X.C786410Ut5.H2(r8, r0)
            boolean r0 = r3 instanceof android.app.ActivityManager
            r2 = 0
            if (r0 != 0) goto L2a
            r3 = r2
        L2a:
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            r4 = 0
            if (r3 == 0) goto L88
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyHacu2SzYe563Oh5HmwJBbrfWUKFb893zOoCcQKXtO"
            r1.<init>(r0, r2)
            X.C2204961BRm.LJFF(r3, r7, r1)
            long r2 = r7.availMem
        L3c:
            long r0 = (long) r6
            long r2 = r2 / r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L45
        L42:
            r2 = 31457280(0x1e00000, double:1.55419614E-316)
        L45:
            X.0mS0 r0 = new X.0mS0
            r0.<init>(r2)
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZJ = r0
        L4c:
            android.os.HandlerThread r0 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZ
            if (r0 != 0) goto L5c
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r0 = "Cache-Building Thread"
            r1.<init>(r0, r6)
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZ = r1
            r1.start()
        L5c:
            android.os.HandlerThread r0 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZ
            if (r0 == 0) goto L71
            android.os.Looper r1 = X.C786410Ut5.W2(r0)
            if (r1 == 0) goto L71
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager$CacheHandler r0 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZIZ
            if (r0 != 0) goto L71
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager$CacheHandler r0 = new com.bytedance.common.meteor.render.newcache.BitmapCacheManager$CacheHandler
            r0.<init>(r1)
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZIZ = r0
        L71:
            r0 = 1
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LJI = r0
        L74:
            java.util.HashMap<X.0m7z, X.0mRz> r2 = com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LJ
            boolean r0 = r2.containsKey(r9)
            if (r0 != 0) goto L87
            X.0mRz r1 = new X.0mRz
            r0 = 0
            r1.<init>(r0)
            r2.put(r9, r1)
            com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZLLL = r9
        L87:
            return
        L88:
            r2 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.meteor.render.newcache.BitmapCacheManager.LIZIZ(android.content.Context, X.0m7z, X.0m8f):void");
    }

    public static void LIZLLL(AbstractC1396700mRw abstractC1396700mRw, C1384750m8f c1384750m8f, boolean z) {
        CacheHandler cacheHandler = LIZIZ;
        if (cacheHandler != null) {
            Message messageObtainMessage = cacheHandler.obtainMessage(1, new Pair(abstractC1396700mRw, c1384750m8f));
            if (z) {
                cacheHandler.sendMessageAtFrontOfQueue(messageObtainMessage);
            } else {
                cacheHandler.sendMessage(messageObtainMessage);
            }
        }
    }
}
