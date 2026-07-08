package com.ss.android.ugc.aweme.aigc;

import X.AbstractC1242220iQm;
import X.C01GW;
import X.C04TD;
import X.C0CNO;
import X.C0LH5;
import X.C0MJP;
import X.C0MJQ;
import X.C0VSJ;
import X.C1221410htD;
import X.C1221750htl;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C19EG;
import X.C20175213ws;
import X.C201955140j;
import X.C2215311Bn7;
import X.C2215321Bn8;
import X.C2215331Bn9;
import X.C2215341BnA;
import X.C2215351BnB;
import X.C2216131BoR;
import X.C2471909mP;
import X.C452501pT;
import X.C533930Kwp;
import X.C540290LGx;
import X.C566350MJd;
import X.EnumC1221320ht4;
import X.EnumC1221500htM;
import X.EnumC20175313wt;
import X.EnumC2215301Bn6;
import X.InterfaceC1221510htN;
import X.InterfaceC1221660htc;
import Y.AfS11S0100100_34;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS435S0200000_34;
import lth.o;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public final class AIGCAvatarServiceImpl implements IAIGCAvatarService {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(36));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(35));

    public static IAIGCAvatarService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAIGCAvatarService.class, false);
        if (objLIZ != null) {
            return (IAIGCAvatarService) objLIZ;
        }
        if (C04TD.LJZI == null) {
            synchronized (IAIGCAvatarService.class) {
                if (C04TD.LJZI == null) {
                    C04TD.LJZI = new AIGCAvatarServiceImpl();
                }
            }
        }
        return C04TD.LJZI;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final List<AIGCStyle> LIZ() {
        ResponseAIGCStyles responseAIGCStyles;
        List<ResponseAIGCStyle> list;
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_STYLE, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZJ.getValue().getClass();
        try {
            responseAIGCStyles = C2215311Bn7.LIZ().LIZ().execute().LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            responseAIGCStyles = null;
        }
        if (responseAIGCStyles != null && responseAIGCStyles.status_code == 0) {
            C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_STYLE, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
        } else {
            C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_STYLE, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, String.valueOf(responseAIGCStyles != null ? Integer.valueOf(responseAIGCStyles.status_code) : null), responseAIGCStyles != null ? responseAIGCStyles.status_msg : null, 8);
        }
        if (responseAIGCStyles == null || (list = responseAIGCStyles.aigcStyles) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ResponseAIGCStyle responseAIGCStyle : list) {
            responseAIGCStyle.getClass();
            arrayList.add(new AIGCStyle(responseAIGCStyle.name, responseAIGCStyle.styleImage, responseAIGCStyle.displayName));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final List<AIGCQuota> Vq() throws InterruptedException {
        ResponseAIGCQuotas responseAIGCQuotas;
        List<Quota> list;
        String str;
        gr(EnumC1221320ht4.SOCIAL);
        this.LIZJ.getValue().getClass();
        String message = null;
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_QUOTA, EnumC20175313wt.START, null, null, null, null, 60);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            responseAIGCQuotas = C2215311Bn7.LIZ().LIZJ().execute().LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            message = e.getMessage();
            responseAIGCQuotas = null;
        }
        if (responseAIGCQuotas != null && responseAIGCQuotas.status_code == 0) {
            C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GET_QUOTA, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null, null, null, 56);
        } else {
            C20175213ws c20175213ws = C20175213ws.LIZ;
            EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_GET_QUOTA;
            EnumC20175313wt enumC20175313wt = EnumC20175313wt.FAIL;
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
            String strValueOf = String.valueOf(responseAIGCQuotas != null ? Integer.valueOf(responseAIGCQuotas.status_code) : null);
            if (responseAIGCQuotas != null && (str = responseAIGCQuotas.status_msg) != null) {
                message = str;
            }
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, enumC20175313wt, lValueOf, null, strValueOf, message, 8);
        }
        if (responseAIGCQuotas == null || (list = responseAIGCQuotas.quotas) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Quota quota : list) {
            quota.getClass();
            arrayList.add(new AIGCQuota(quota.quotaType, quota.quotaRemain));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final int Wq() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("aigc_creative_slow_max_count", 10);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final int er() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("aigc_creative_slow_min_count", 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BnA] */
    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C2215341BnA br(JSONArray jSONArray) {
        return new AbstractC1242220iQm(new AIGCApi(), jSONArray) { // from class: X.1BnA
            public final AIGCApi LLILLJJLI;
            public final JSONArray LLILLL;

            @Override // X.AbstractC1242220iQm, X.InterfaceC1221470htJ
            public void start() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_FAST_GEN, EnumC20175313wt.START, null, null, null, null, 60);
                AIGCApi aIGCApi = this.LLILLJJLI;
                JSONArray jSONArray2 = this.LLILLL;
                aIGCApi.getClass();
                C2215311Bn7.LIZ().quickGenerate(jSONArray2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS11S0100100_34(jElapsedRealtime, this, 2), new AfS11S0100100_34(jElapsedRealtime, this, 3));
                ((C09AE) this.LL.getValue()).start();
            }

            {
                super(aIGCApi);
                this.LLILLJJLI = aIGCApi;
                this.LLILLL = jSONArray;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BnB] */
    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C2215351BnB dr(String str) {
        return new AbstractC1242220iQm(new AIGCApi(), str) { // from class: X.1BnB
            public final AIGCApi LLILLJJLI;
            public final String LLILLL;

            @Override // X.AbstractC1242220iQm, X.InterfaceC1221470htJ
            public void start() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GEN_MORE, EnumC20175313wt.START, null, null, null, null, 60);
                AIGCApi aIGCApi = this.LLILLJJLI;
                String str2 = this.LLILLL;
                aIGCApi.getClass();
                C2215311Bn7.LIZ().generateMore(str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS11S0100100_34(jElapsedRealtime, this, 0), new AfS11S0100100_34(jElapsedRealtime, this, 1));
                ((C09AE) this.LL.getValue()).start();
            }

            {
                super(aIGCApi);
                this.LLILLJJLI = aIGCApi;
                this.LLILLL = str;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
    
        if (r2.intValue() == r1) goto L43;
     */
    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1221710hth gr(X.EnumC1221320ht4 r10) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl.gr(X.0ht4):X.0hth");
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void Yq(C19EG c19eg, AwS385S0200000_19 awS385S0200000_19) {
        C566350MJd.LIZ(c19eg, awS385S0200000_19);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final boolean ar(EnumC1221320ht4 enumC1221320ht4, String str) {
        AIGCTaskStatus aIGCTaskStatus;
        if (C2215321Bn8.LIZ()) {
            if (str != null) {
                C2215321Bn8.LIZJ().getClass();
                Integer numValueOf = Integer.valueOf(AIGCApi.LIZ(str).discardResult);
                if (enumC1221320ht4 != null) {
                    C2215321Bn8.LIZIZ.remove(enumC1221320ht4);
                    Map<String, C2215331Bn9> map = C2215321Bn8.LIZJ;
                    C2215331Bn9 c2215331Bn9 = (C2215331Bn9) ((LinkedHashMap) map).get(str);
                    if (c2215331Bn9 != null) {
                        c2215331Bn9.stop();
                    }
                    map.remove(str);
                    List list = (List) ((LinkedHashMap) C2215321Bn8.LIZ).get(enumC1221320ht4);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1221660htc) it2.next()).onUpdate(C2215321Bn8.LJ(null, null));
                        }
                    }
                }
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    return true;
                }
                return false;
            }
            if (enumC1221320ht4 != null) {
                Map<EnumC1221320ht4, String> map2 = C2215321Bn8.LIZIZ;
                String str2 = (String) ((LinkedHashMap) map2).get(enumC1221320ht4);
                if (str2 == null) {
                    C2215321Bn8.LIZJ().getClass();
                    List<AIGCTaskStatus> list2 = AIGCApi.LIZJ(null).tasks;
                    if (list2 != null && (aIGCTaskStatus = (AIGCTaskStatus) C13LP.LJJJLL(list2)) != null && (str2 = aIGCTaskStatus.taskId) != null) {
                        map2.put(enumC1221320ht4, str2);
                    } else {
                        return false;
                    }
                }
                C2215321Bn8.LIZJ().getClass();
                Integer numValueOf2 = Integer.valueOf(AIGCApi.LIZ(str2).discardResult);
                map2.remove(enumC1221320ht4);
                Map<String, C2215331Bn9> map3 = C2215321Bn8.LIZJ;
                C2215331Bn9 c2215331Bn92 = (C2215331Bn9) ((LinkedHashMap) map3).get(str2);
                if (c2215331Bn92 != null) {
                    c2215331Bn92.stop();
                }
                map3.remove(str2);
                List list3 = (List) ((LinkedHashMap) C2215321Bn8.LIZ).get(enumC1221320ht4);
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1221660htc) it3.next()).onUpdate(C2215321Bn8.LJ(null, null));
                    }
                }
                if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void cr(EnumC1221320ht4 enumC1221320ht4, C1221750htl c1221750htl) {
        C0CNO.LIZ((ExecutorService) this.LIZIZ.getValue(), new AwS435S0200000_34(enumC1221320ht4, c1221750htl, 3));
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void fr(EnumC1221320ht4 enumC1221320ht4, InterfaceC1221660htc interfaceC1221660htc) {
        C2215331Bn9 c2215331Bn9;
        List list = (List) ((LinkedHashMap) C2215321Bn8.LIZ).get(enumC1221320ht4);
        if (list != null) {
            list.remove(interfaceC1221660htc);
        }
        Object obj = ((LinkedHashMap) C2215321Bn8.LIZIZ).get(enumC1221320ht4);
        if (obj != null && (c2215331Bn9 = (C2215331Bn9) ((LinkedHashMap) C2215321Bn8.LIZJ).get(obj)) != null) {
            c2215331Bn9.unregisterListener(interfaceC1221660htc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0HHk] */
    public static final void LIZJ(final C19EG c19eg, InterfaceC1221510htN interfaceC1221510htN, List list) throws Throwable {
        Iterator it2;
        int i;
        try {
            it2 = list.iterator();
            i = 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC1221510htN != null) {
                interfaceC1221510htN.LIZ(EnumC1221500htM.FAIL, -1);
            } else {
                return;
            }
        }
        while (it2.hasNext()) {
            i++;
            final String str = (String) it2.next();
            final String nickname = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getNickname();
            String strLIZ = new Object(c19eg, str, nickname) { // from class: X.0HHk
                public static final C01GW<C20022113Vr> LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(504));
                public final String LIZ;
                public final String LIZIZ;
                public final Context LIZJ;
                public final Map<Integer, View> LIZLLL = new LinkedHashMap();

                public final String LIZ() {
                    View view;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LIZ);
                    if (bitmapDecodeFile == null) {
                        return null;
                    }
                    int width = bitmapDecodeFile.getWidth();
                    int height = bitmapDecodeFile.getHeight();
                    int i2 = width > height ? height : width;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmapDecodeFile, (width - i2) / 2, (height - i2) / 2, i2, i2), 750, 750, true);
                    int width2 = bitmapCreateScaledBitmap.getWidth();
                    if (((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(width2)) != null) {
                        Object obj = ((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(width2));
                        if (obj == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        view = (View) obj;
                    } else {
                        RelativeLayout relativeLayout = new RelativeLayout(this.LIZJ);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, relativeLayout.getContext());
                        if (numLIZJ != null) {
                            relativeLayout.setBackgroundColor(numLIZJ.intValue());
                        }
                        C786410Ut5.e6(relativeLayout, new ViewGroup.LayoutParams(width2, relativeLayout.getHeight()));
                        TuxIconView tuxIconView = new TuxIconView(this.LIZJ, null, 0, 6, null);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_ai;
                        tuxIconView.setTuxIcon(c419910GdJ);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(28, 28);
                        layoutParams.setMargins(16, 16, 0, 16);
                        layoutParams.addRule(20);
                        C786410Ut5.M6(tuxIconView, layoutParams);
                        tuxIconView.setId(R.id.au2);
                        relativeLayout.addView(tuxIconView);
                        ImageView imageView = new ImageView(this.LIZJ);
                        imageView.setAdjustViewBounds(true);
                        imageView.setImageResource(R.drawable.a6p);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, 18);
                        layoutParams2.setMargins(8, 21, 0, 21);
                        layoutParams2.addRule(17, R.id.au2);
                        C786410Ut5.c6(imageView, layoutParams2);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        relativeLayout.addView(imageView);
                        TuxTextView tuxTextView = new TuxTextView(this.LIZJ, null, 6, 0);
                        tuxTextView.setTextColorRes(R.attr.a1h);
                        tuxTextView.setTuxFont(62);
                        tuxTextView.LJJJJI(C11VU.LJII(22.0f, tuxTextView.getContext()));
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams3.setMargins(0, 0, 17, 0);
                        layoutParams3.addRule(21);
                        layoutParams3.addRule(15);
                        C786410Ut5.R6(tuxTextView, layoutParams3);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('@');
                        sbLIZ.append(this.LIZIZ);
                        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                        relativeLayout.addView(tuxTextView);
                        relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec(60, 1073741824));
                        relativeLayout.layout(0, 0, width2, 60);
                        this.LIZLLL.put(Integer.valueOf(width2), relativeLayout);
                        view = relativeLayout;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, bitmapCreateScaledBitmap.getHeight() + 60, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    C842150X1x.LIZIZ(canvas2, view);
                    canvas2.drawBitmap(bitmapCreateBitmap2, new Matrix(), paint);
                    canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, bitmapCreateScaledBitmap.getHeight(), (Paint) null);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(LJ.getValue().LJ);
                    String str2 = File.separator;
                    sbLIZ2.append(str2);
                    sbLIZ2.append("AIGC");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(this.LIZ.hashCode());
                    sbLIZ2.append(".png");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    if (!TextUtils.isEmpty(strLIZIZ)) {
                        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                        if (!c0vsj.exists()) {
                            try {
                                File parentFile = c0vsj.getParentFile();
                                if (!parentFile.exists()) {
                                    parentFile.mkdirs();
                                }
                                c0vsj.createNewFile();
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                    C0VSV c0vsv = new C0VSV(strLIZIZ);
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                    c0vsv.flush();
                    c0vsv.close();
                    return strLIZIZ;
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = nickname;
                    this.LIZJ = c19eg;
                }
            }.LIZ();
            if (strLIZ != null) {
                C2471909mP.LJJIJIIJI(c19eg, strLIZ, new C0VSJ(strLIZ).getName(), false, null, 112);
                if (interfaceC1221510htN != null) {
                    interfaceC1221510htN.LIZ(EnumC1221500htM.IN_PROGRESS, Integer.valueOf(i));
                }
            } else {
                throw new RuntimeException("");
            }
            interfaceC1221510htN.LIZ(EnumC1221500htM.SUCCESS, Integer.valueOf(list.size()));
        }
        if (interfaceC1221510htN == null) {
            return;
        }
        interfaceC1221510htN.LIZ(EnumC1221500htM.SUCCESS, Integer.valueOf(list.size()));
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C2215331Bn9 Xq(EnumC1221320ht4 enumC1221320ht4, String str, C1221750htl c1221750htl) {
        try {
            return C2215321Bn8.LIZLLL(enumC1221320ht4, str, c1221750htl);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("AIGC retrySlowGenerateTask fail", e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void ir(final C19EG c19eg, final C1221410htD c1221410htD, final List list) throws Throwable {
        c1221410htD.LIZ(EnumC1221500htM.IN_PROGRESS, 0);
        if (Build.VERSION.SDK_INT < 29 && !C533930Kwp.LJFF()) {
            C540290LGx.LJI(C540290LGx.LIZ, c19eg, new C0LH5() { // from class: X.0hu0
                @Override // X.C0LH5
                public final void LIZ(int[] iArr, String[] strArr) throws Throwable {
                    if (C533930Kwp.LIZ(iArr)) {
                        AIGCAvatarServiceImpl.LIZJ(c19eg, c1221410htD, list);
                    } else {
                        InterfaceC1221510htN interfaceC1221510htN = c1221410htD;
                        if (interfaceC1221510htN == null) {
                            return;
                        }
                        interfaceC1221510htN.LIZ(EnumC1221500htM.FAIL, -1);
                    }
                }
            }, null, null, null, new TokenCert("bpea-tools_request_aigc_download_avatar"), 28);
        } else {
            LIZJ(c19eg, c1221410htD, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C2215331Bn9 Zq(EnumC1221320ht4 enumC1221320ht4, JSONArray jSONArray, JSONArray jSONArray2, C1221750htl c1221750htl) {
        try {
            return C2215321Bn8.LIZIZ(enumC1221320ht4, jSONArray, jSONArray2, c1221750htl);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("AIGC createSlowGenerateTask fail", e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void jr(C19EG c19eg, EnumC1221320ht4 enumC1221320ht4, String str, String str2, boolean z) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(c19eg, "ai_avatar", true)) {
            if (!this.LIZ) {
                o.LJFF(C2216131BoR.LIZ());
                this.LIZ = true;
            }
            C566350MJd.LIZ(c19eg, new C0MJQ(c19eg, enumC1221320ht4, str2, str, z));
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void hr(EnumC1221320ht4 enumC1221320ht4, C19EG c19eg, Integer num, Integer num2, boolean z, String str, String str2) {
        int iLJ;
        int iLJ2;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(c19eg, "ai_avatar", true)) {
            if (!this.LIZ) {
                o.LJFF(C2216131BoR.LIZ());
                this.LIZ = true;
            }
            if (num != null) {
                iLJ = num.intValue();
            } else {
                SettingsManager.LIZLLL().getClass();
                iLJ = SettingsManager.LJ("aigc_creative_slow_min_count", 3);
            }
            if (num2 != null) {
                iLJ2 = num2.intValue();
            } else {
                SettingsManager.LIZLLL().getClass();
                iLJ2 = SettingsManager.LJ("aigc_creative_slow_max_count", 10);
            }
            C566350MJd.LIZ(c19eg, new C0MJP(iLJ, iLJ2, c19eg, enumC1221320ht4, str2, str, z));
        }
    }
}
