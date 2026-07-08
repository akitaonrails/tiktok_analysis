package com.ss.android.ugc.aweme.coverpreview.activity;

import X.AbstractC2172971A2l;
import X.AbstractC339500DSq;
import X.C01GW;
import X.C054G;
import X.C0XF1;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C299020Bno;
import X.C335910DEv;
import X.C345720Dgw;
import X.C345750Dgz;
import X.C345760Dh0;
import X.C345780Dh2;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.ViewTreeObserverOnPreDrawListenerC346400Di2;
import Y.ACListenerS139S0100000_4;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NewCoverPreviewActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjPyohODcpPyY2HELIOSP2stKjs6Piw4MGEdLTIPJjk2OhU+LDk6LTINKjs6Piw4MA==";
    public String LL = "";
    public final UrlModel LLILLJJLI = new UrlModel();
    public final IAVPublishService LLILLL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 130));
    public final C054G LLILZIL = C2296808zG.LIZIZ();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0DSo, X.19ry, X.1A2l] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        List<String> listAsList;
        ArrayList arrayList;
        UrlModel cover;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.jp);
        try {
            stringExtra = getIntent().getStringExtra("nick_name");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LL = stringExtra;
        String[] stringArrayExtra = getIntent().getStringArrayExtra("avatar");
        UrlModel urlModel = this.LLILLJJLI;
        if (stringArrayExtra != null) {
            listAsList = Arrays.asList(stringArrayExtra);
        } else {
            listAsList = null;
        }
        urlModel.setUrlList(listAsList);
        View decorView = getWindow().getDecorView();
        C786410Ut5.y3(decorView.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC346400Di2(decorView, this, 0));
        View viewFindViewById = findViewById(R.id.bmy);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(this, 82), viewFindViewById);
        }
        if (this.LLILLJJLI != null && this.LL != null) {
            SmartImageView smartImageView = (SmartImageView) findViewById(R.id.bh2);
            if (smartImageView != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(this.LLILLJJLI));
                c1331670kl3LJIIIIZZ.LJJIL(this);
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            TextView textView = (TextView) findViewById(R.id.p9_);
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                sbLIZ.append(this.LL);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0q);
            if (recyclerView != 0) {
                recyclerView.setLayoutManager(new NonScrollableGridLayoutManager(recyclerView.getContext()));
                final Map mapLIZJ = C2097908Jt.LIZJ(new Pair(C345750Dgz.class, new AbstractC339500DSq<C345750Dgz, C345760Dh0>() { // from class: X.0Dgy
                    public static final /* synthetic */ int LIZ = 0;

                    @Override // X.AbstractC339500DSq
                    public final C345760Dh0 LJ(ViewGroup viewGroup) {
                        return new C345760Dh0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cxk, viewGroup, false));
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZ(Object obj, Object obj2) {
                        return Intrinsics.LJFF(((C345750Dgz) obj).LIZ, ((C345750Dgz) obj2).LIZ);
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZIZ(Object obj, Object obj2) {
                        return Intrinsics.LJFF(((C345750Dgz) obj).LIZ, ((C345750Dgz) obj2).LIZ);
                    }

                    @Override // X.AbstractC339500DSq
                    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj) {
                        C345750Dgz c345750Dgz = (C345750Dgz) obj;
                        C345760Dh0 c345760Dh0 = (C345760Dh0) viewHolder;
                        if (c345750Dgz.LIZJ) {
                            C786410Ut5.u5((SmartImageView) c345760Dh0.LL.findViewById(R.id.cover), 0.5f);
                        } else {
                            C786410Ut5.u5((SmartImageView) c345760Dh0.LL.findViewById(R.id.cover), 1.0f);
                        }
                        Bitmap bitmap = c345750Dgz.LIZIZ;
                        if (bitmap != null) {
                            ((C1322090kVb) c345760Dh0.LL.findViewById(R.id.cover)).setImageBitmap(bitmap);
                            return;
                        }
                        C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c345750Dgz.LIZ));
                        c1331670kl3LJIIIIZZ2.LJJ((InterfaceC1334290kpH) c345760Dh0.LL.findViewById(R.id.cover));
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                    }
                }));
                ?? r3 = new AbstractC2172971A2l<Object, RecyclerView.ViewHolder>(mapLIZJ) { // from class: X.0DSo
                    public final Map<Object, AbstractC339500DSq<Object, RecyclerView.ViewHolder>> LLILLJJLI;
                    public final Map<Integer, AbstractC339500DSq<Object, RecyclerView.ViewHolder>> LLILLL;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(new AbstractC339510DSr<Object>(mapLIZJ) { // from class: X.0DSp
                            public final Map<Object, AbstractC339500DSq<Object, RecyclerView.ViewHolder>> LIZ;

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LIZ = mapLIZJ;
                            }

                            @Override // X.AbstractC339510DSr
                            public final boolean LIZ(Object obj, Object obj2) {
                                AbstractC339500DSq<Object, RecyclerView.ViewHolder> abstractC339500DSq = this.LIZ.get(obj.getClass());
                                if (abstractC339500DSq != null) {
                                    return abstractC339500DSq.LIZ(obj, obj2);
                                }
                                return false;
                            }

                            @Override // X.AbstractC339510DSr
                            public final boolean LIZIZ(Object obj, Object obj2) {
                                AbstractC339500DSq<Object, RecyclerView.ViewHolder> abstractC339500DSq;
                                if (obj.getClass() != obj2.getClass() || (abstractC339500DSq = this.LIZ.get(obj.getClass())) == null) {
                                    return false;
                                }
                                return abstractC339500DSq.LIZIZ(obj, obj2);
                            }
                        });
                        this.LLILLJJLI = mapLIZJ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZJ.size()));
                        for (Map.Entry entry : mapLIZJ.entrySet()) {
                            linkedHashMap.put(Integer.valueOf(C13LP.LJJJZ(entry.getValue(), this.LLILLJJLI.values())), entry.getValue());
                        }
                        this.LLILLL = linkedHashMap;
                    }

                    public final AbstractC339500DSq<Object, RecyclerView.ViewHolder> LLLIIIIL(int i) {
                        return (AbstractC339500DSq) C2097608Jq.LJFF(Integer.valueOf(i), this.LLILLL);
                    }

                    @Override // X.AbstractC21673619ry
                    public final int getItemViewType(int i) {
                        return C13LP.LJJJZ(LLLFZ(i).getClass(), this.LLILLJJLI.keySet());
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                        LLLIIIIL(viewHolder.getItemViewType()).getClass();
                        super.onViewAttachedToWindow(viewHolder);
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                        LLLIIIIL(viewHolder.getItemViewType()).getClass();
                        super.onViewDetachedFromWindow(viewHolder);
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                        LLLIIIIL(viewHolder.getItemViewType()).getClass();
                        super.onViewRecycled(viewHolder);
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                        LLLIIIIL(getItemViewType(i)).LIZLLL(viewHolder, LLLFZ(i));
                    }

                    @Override // X.AbstractC21673619ry
                    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                        C345760Dh0 c345760Dh0LJ = LLLIIIIL(i).LJ(viewGroup);
                        if (c345760Dh0LJ != null) {
                            try {
                                View view = c345760Dh0LJ.itemView;
                                if (view != null) {
                                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        c345760Dh0LJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                        try {
                            if (c345760Dh0LJ.itemView.getParent() != null) {
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(C345760Dh0.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i);
                                    C1AF0.LIZJ(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) c345760Dh0LJ.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C786410Ut5.LJJJLZIJ(c345760Dh0LJ.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C2081408Dk.LIZ(e3);
                            C2344809Gs.LIZ(e3);
                        }
                        C20612085q.LIZ = C345760Dh0.class.getName();
                        return c345760Dh0LJ;
                    }

                    @Override // X.AbstractC21673619ry
                    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
                        if (list.isEmpty()) {
                            onBindViewHolder(viewHolder, i);
                            return;
                        }
                        AbstractC339500DSq<Object, RecyclerView.ViewHolder> abstractC339500DSqLLLIIIIL = LLLIIIIL(getItemViewType(i));
                        LLLFZ(i);
                        abstractC339500DSqLLLIIIIL.getClass();
                    }
                };
                recyclerView.addItemDecoration(new C345780Dh2(3, recyclerView.getResources().getDimensionPixelSize(R.dimen.pt), true));
                recyclerView.setAdapter(r3);
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPreloadedCoverPreviewFeedItems();
                if (!C0XF1.LIZLLL(recyclerView.getContext())) {
                    T t = c259800zU.element;
                    if (t != 0 && ((List) t).size() > 0) {
                        Iterable<Aweme> iterable = (Iterable) c259800zU.element;
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                        for (Aweme aweme : iterable) {
                            Video video = aweme.getVideo();
                            if (video != null) {
                                cover = video.getCover();
                            } else {
                                cover = null;
                            }
                            AwemeExtKt.isTop(aweme);
                            arrayList2.add(new C345750Dgz(cover, null, true));
                        }
                        arrayList = new ArrayList(C13LP.LL(arrayList2, 12));
                        ListProtector.add(arrayList, 0, new C345750Dgz(null, this.LLILLL.getPreviewProfileBitmap(), false));
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new C345750Dgz(null, this.LLILLL.getPreviewProfileBitmap(), false));
                    }
                    r3.LLLI(C13LP.LLIIII(arrayList));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new C345750Dgz(null, this.LLILLL.getPreviewProfileBitmap(), false));
                    r3.LLLI(C13LP.LLIIII(arrayList3));
                    C23250099c.LIZLLL(this.LLILZIL, null, null, new C345720Dgw(this, r3, c259800zU, null), 3);
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
