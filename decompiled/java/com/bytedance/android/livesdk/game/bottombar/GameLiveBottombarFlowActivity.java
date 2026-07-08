package com.bytedance.android.livesdk.game.bottombar;

import X.C011Z;
import X.C0OM1;
import X.C0TVI;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C19EH;
import X.C19ME;
import X.C20441214yg;
import X.C20632315oP;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C475860IlM;
import X.C475870IlN;
import X.C483860IyG;
import X.C483880IyI;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC483890IyJ;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.game.bottombar.avatar.top.GameLiveBottombarAvatarFragment;
import com.bytedance.android.livesdk.livesetting.game.GameliveBottombarFlowSetting;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class GameLiveBottombarFlowActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExJzHELIOSE4JiIxKTdiDi4+LQklPyoRJzE4JiIxKTcKJSAkCSY4IDk6PDw=";
    public TuxNavBar LL;
    public View LLILLJJLI;
    public C20632315oP LLILLL;
    public GameLiveBottombarAvatarFragment LLILZ;
    public C483860IyG LLILZIL;
    public InterfaceC483890IyJ LLILZLL;
    public boolean LLIZ;
    public Map<String, String> LLJI;
    public final ArrayList<C475860IlM> LLIZLLLIL = new ArrayList<>();
    public String LLJ = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "live_bottom_bar";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C483860IyG c483860IyG = this.LLILZIL;
        if (c483860IyG != null) {
            c483860IyG.LLJI.clear();
        }
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        String str;
        InterfaceC483890IyJ interfaceC483890IyJ;
        C20632315oP c20632315oP;
        String str2;
        int iIntValue2;
        String stringExtra;
        String stringExtra2;
        HashMap map;
        String str3 = "";
        super.onCreate(bundle);
        C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", "onCreate");
        getTheme().applyStyle(C011Z.LIZ.LJIIIZ(), false);
        getWindow().getDecorView().setSystemUiVisibility(256);
        getWindow().addFlags(Integer.MIN_VALUE);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exx, this);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        getWindow().setStatusBarColor(iIntValue);
        setContentView(R.layout.gm8);
        this.LL = (TuxNavBar) findViewById(R.id.p15);
        this.LLILLJJLI = findViewById(R.id.iis);
        this.LLILLL = (C20632315oP) findViewById(R.id.view_pager_video);
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("params");
            LinkedHashMap linkedHashMap = null;
            if ((serializableExtra instanceof HashMap) && (map = (HashMap) serializableExtra) != null) {
                linkedHashMap = new LinkedHashMap(map);
            }
            this.LLJI = linkedHashMap;
            try {
                stringExtra = getIntent().getStringExtra("enterFromMerge");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LLJIJIL = stringExtra;
            try {
                stringExtra2 = getIntent().getStringExtra("enterMethod");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "live_bottom_bar";
            }
            this.LLJILJIL = stringExtra2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseIntentParams, enterFromMerge: ");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(", enterMethod: ");
            sbLIZ.append(this.LLJILJIL);
            sbLIZ.append(",params: ");
            sbLIZ.append(this.LLJI);
            C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parseIntentParams error, msg: ");
            sbLIZ2.append(th.getMessage());
            C20441214yg.LJ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Map<String, String> map2 = this.LLJI;
        if (map2 == null || (str = map2.get("bottom_bar_feed_type")) == null) {
            str = "";
        }
        if (Intrinsics.LJFF(str, "MLBB")) {
            interfaceC483890IyJ = new InterfaceC483890IyJ() { // from class: X.0IlD
                public final ArrayList<C475860IlM> LIZ = new ArrayList<>();

                @Override // X.InterfaceC483890IyJ
                public final boolean LIZ() {
                    return (this.LIZ.size() >= 2) && GameliveBottombarFlowSetting.enableFlowPageChoice;
                }

                @Override // X.InterfaceC483890IyJ
                public final String LJ() {
                    String str4;
                    if (LIZ()) {
                        return C497740JfY.LJIJI(2131851457);
                    }
                    C475860IlM c475860IlM = (C475860IlM) C13LP.LJJJLZIJ(0, this.LIZ);
                    if (c475860IlM == null || (str4 = c475860IlM.LIZIZ) == null) {
                        str4 = "";
                    }
                    return C497740JfY.LJIJJ(2131851456, str4);
                }

                @Override // X.InterfaceC483890IyJ
                public final List<C475860IlM> LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC483890IyJ
                public final void LIZIZ(Intent intent) {
                    LinkedHashMap linkedHashMap2;
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    HashMap map3;
                    Serializable serializableExtra2 = intent.getSerializableExtra("params");
                    String str4 = null;
                    if ((serializableExtra2 instanceof HashMap) && (map3 = (HashMap) serializableExtra2) != null) {
                        linkedHashMap2 = new LinkedHashMap(map3);
                    } else {
                        linkedHashMap2 = null;
                    }
                    this.LIZ.clear();
                    ArrayList<C475860IlM> arrayList = this.LIZ;
                    if (linkedHashMap2 != null) {
                        str4 = (String) linkedHashMap2.get("related_live_tag");
                    }
                    if (linkedHashMap2 == null || (obj = linkedHashMap2.get("tag_name")) == null) {
                        obj = "";
                    }
                    if (linkedHashMap2 == null || (obj2 = linkedHashMap2.get("bottombar_content_type")) == null) {
                        obj2 = "";
                    }
                    if (linkedHashMap2 == null || (obj3 = linkedHashMap2.get("bottombar_content")) == null) {
                        obj3 = "";
                    }
                    if (linkedHashMap2 == null || (obj4 = linkedHashMap2.get("related_from_request_id")) == null) {
                        obj4 = "";
                    }
                    if (linkedHashMap2 == null || (obj5 = linkedHashMap2.get("related_from_video_id")) == null) {
                        obj5 = "";
                    }
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("parseAvataItemList relatedTag:");
                        sbLIZ3.append(str4);
                        C20441214yg.LIZIZ("GameLiveBottombarAvatarFragment", C2188811AlT.LIZIZ(sbLIZ3));
                        if (str4 != null) {
                            JSONObject jSONObject = new JSONObject(str4);
                            if (jSONObject.has("hero_list")) {
                                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "hero_list");
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                                    if (jSONObject2.has(FollowStatusChangeMethod.PARAM_UID) && jSONObject2.has("name") && jSONObject2.has("icon")) {
                                        long j = JSONObjectProtectorUtils.getLong(jSONObject2, FollowStatusChangeMethod.PARAM_UID);
                                        String string = JSONObjectProtectorUtils.getString(jSONObject2, "name");
                                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "icon");
                                        HashMap map4 = new HashMap();
                                        map4.put("game_name", obj);
                                        map4.put("page_type", "bottombar_feed_hero");
                                        map4.put("bottom_bar_type", "");
                                        map4.put("bottombar_content_type", obj2);
                                        map4.put("bottombar_content", obj3);
                                        map4.put("related_from_request_id", obj4);
                                        map4.put("related_from_video_id", obj5);
                                        map4.put("btn_name", string);
                                        map4.put("bottombar_content_tag", string);
                                        map4.put("bottom_bar_type", obj2);
                                        try {
                                            arrayList2.add(new C475860IlM(j, string, string2, false, false, map4));
                                        } catch (Exception e3) {
                                            e = e3;
                                            TryCatchGuardChecker.doCheck(e);
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("parseAvataItemList error :");
                                            sbLIZ4.append(e);
                                            C20441214yg.LIZIZ("GameLiveBottombarAvatarFragment", C2188811AlT.LIZIZ(sbLIZ4));
                                            C20441214yg.LIZIZ("GameLiveBottombarAvatarFragment", "parseAvataItemList finish :" + arrayList2.size());
                                            arrayList.addAll(arrayList2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                    C20441214yg.LIZIZ("GameLiveBottombarAvatarFragment", "parseAvataItemList finish :" + arrayList2.size());
                    arrayList.addAll(arrayList2);
                }

                @Override // X.InterfaceC483890IyJ
                public final InterfaceC483930IyN LIZJ(Lifecycle lifecycle) {
                    return new C475700Il6(0);
                }
            };
        } else {
            interfaceC483890IyJ = new InterfaceC483890IyJ() { // from class: X.0IlS
                public String LIZ = "";

                @Override // X.InterfaceC483890IyJ
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.InterfaceC483890IyJ
                public final List<C475860IlM> LIZLLL() {
                    return C13BV.INSTANCE;
                }

                @Override // X.InterfaceC483890IyJ
                public final String LJ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC483890IyJ
                public final void LIZIZ(Intent intent) {
                    String str4;
                    HashMap map3;
                    Serializable serializableExtra2 = intent.getSerializableExtra("params");
                    if (!(serializableExtra2 instanceof HashMap) || (map3 = (HashMap) serializableExtra2) == null || (str4 = (String) new LinkedHashMap(map3).get("bottombar_content")) == null) {
                        str4 = "";
                    }
                    this.LIZ = str4;
                }

                @Override // X.InterfaceC483890IyJ
                public final InterfaceC483930IyN LIZJ(Lifecycle lifecycle) {
                    return new C21374118kl(lifecycle);
                }
            };
        }
        interfaceC483890IyJ.LIZIZ(getIntent());
        this.LLIZ = interfaceC483890IyJ.LIZ();
        this.LLIZLLLIL.addAll(interfaceC483890IyJ.LIZLLL());
        this.LLJ = interfaceC483890IyJ.LJ();
        this.LLILZLL = interfaceC483890IyJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("initInjection, type: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", showAvatarList: ");
        sbLIZ3.append(this.LLIZ);
        sbLIZ3.append(", navigatorTitle: ");
        sbLIZ3.append(this.LLJ);
        sbLIZ3.append(", avatarItemList.size: ");
        sbLIZ3.append(this.LLIZLLLIL.size());
        C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ3));
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZJ(new AwS551S0100000_7(this, 663));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            String str4 = this.LLJ;
            if (str4 != null) {
                str3 = str4;
            }
            c1250250idj.LIZJ = str3;
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.exx, this);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            tuxNavBar.setNavBackground(iIntValue2);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("setupFragments, showAvatarList: ");
        sbLIZ4.append(this.LLIZ);
        sbLIZ4.append(',');
        C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ4));
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        View view = this.LLILLJJLI;
        if (view != null && (c20632315oP = this.LLILLL) != null) {
            if (this.LLIZ) {
                C786410Ut5.LJLLLLLL(0, view);
                GameLiveBottombarAvatarFragment gameLiveBottombarAvatarFragment = new GameLiveBottombarAvatarFragment();
                this.LLILZ = gameLiveBottombarAvatarFragment;
                ArrayList<C475860IlM> arrayList = this.LLIZLLLIL;
                if (!arrayList.isEmpty()) {
                    gameLiveBottombarAvatarFragment.LLILZ.clear();
                    gameLiveBottombarAvatarFragment.LLILZ.addAll(arrayList);
                    C475870IlN c475870IlN = gameLiveBottombarAvatarFragment.LL;
                    if (c475870IlN != null) {
                        c475870IlN.LLLII(arrayList);
                    }
                }
                GameLiveBottombarAvatarFragment gameLiveBottombarAvatarFragment2 = this.LLILZ;
                if (gameLiveBottombarAvatarFragment2 != null) {
                    gameLiveBottombarAvatarFragment2.LLILLL = new AwS586S0100000_7(this, 416);
                }
                GameLiveBottombarAvatarFragment gameLiveBottombarAvatarFragment3 = this.LLILZ;
                if (gameLiveBottombarAvatarFragment3 != null) {
                    c19ehLJIIJ.LJIJ(R.id.iis, gameLiveBottombarAvatarFragment3, "avatar_fragment");
                }
            } else {
                C786410Ut5.LJLLLLLL(8, view);
                C19ME c19me = (C19ME) c20632315oP.getLayoutParams();
                c19me.topToBottom = R.id.p15;
                C786410Ut5.r6(c20632315oP, c19me);
            }
            C786410Ut5.LLJI(c20632315oP, 0);
            List listSynchronizedList = Collections.synchronizedList(new ArrayList());
            if (this.LLIZLLLIL.isEmpty()) {
                listSynchronizedList.add(new C483880IyI(this.LLJIJIL, this.LLJILJIL, this.LLJI, this.LLILZLL, 8));
                C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", "avatarItemList is empty, build default fragment config");
            } else {
                int size = this.LLIZLLLIL.size();
                if (this.LLIZ) {
                    if (size >= 4 && size != 5) {
                        size = 4;
                    }
                } else {
                    size = 1;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("configureVideoFragments sourceSize ");
                sbLIZ5.append(size);
                sbLIZ5.append(", allSize: ");
                sbLIZ5.append(this.LLIZLLLIL.size());
                C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ5));
                for (int i = 0; i < size && i < this.LLIZLLLIL.size(); i++) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Map<String, String> map3 = this.LLJI;
                    if (map3 != null) {
                        linkedHashMap2.putAll(map3);
                    }
                    linkedHashMap2.put("bottombar_content_tag", ((C475860IlM) ListProtector.get(this.LLIZLLLIL, i)).LIZIZ);
                    if ((!((C475860IlM) ListProtector.get(this.LLIZLLLIL, i)).LJFF.isEmpty()) && ((C475860IlM) ListProtector.get(this.LLIZLLLIL, i)).LJFF.containsKey("extra_list_flag")) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str2 = "1";
                    }
                    linkedHashMap2.put("is_in_more_list", str2);
                    String str5 = this.LLJIJIL;
                    String str6 = this.LLJILJIL;
                    long j = ((C475860IlM) ListProtector.get(this.LLIZLLLIL, i)).LIZ;
                    C483880IyI c483880IyI = new C483880IyI(str5, str6, linkedHashMap2, j, this.LLILZLL);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("configureVideoFragments build fragment[index=");
                    sbLIZ6.append(i);
                    sbLIZ6.append("][avatarId=");
                    sbLIZ6.append(j);
                    sbLIZ6.append(']');
                    C20441214yg.LIZIZ("GameLiveBottombarFlowActivity", C2188811AlT.LIZIZ(sbLIZ6));
                    listSynchronizedList.add(c483880IyI);
                }
            }
            C483860IyG c483860IyG = new C483860IyG(this, listSynchronizedList);
            this.LLILZIL = c483860IyG;
            c20632315oP.setAdapter(c483860IyG);
            c20632315oP.LJ(0, false);
            c20632315oP.setUserInputEnabled(false);
            c20632315oP.setOffscreenPageLimit(-1);
            c19ehLJIIJ.LJIIIZ();
        }
        View viewFindViewById = findViewById(R.id.dyj);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0DM8
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
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
