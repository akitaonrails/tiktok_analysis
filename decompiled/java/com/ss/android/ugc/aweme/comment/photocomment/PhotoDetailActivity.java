package com.ss.android.ugc.aweme.comment.photocomment;

import X.C01GW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1339550kxl;
import X.C1341200l0Q;
import X.C1341210l0R;
import X.C1341220l0S;
import X.C1344350l5V;
import X.C1350920lG6;
import X.C1360720lVu;
import X.C13LP;
import X.C1697810uHb;
import X.C294220Bg4;
import X.C299020Bno;
import X.C335910DEv;
import X.C438710HIf;
import X.C452501pT;
import X.C708740Rr6;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1341600l14;
import X.EnumC1342450l2R;
import X.EnumC335920DEw;
import X.InterfaceC427850Gq7;
import X.InterfaceC658750Psf;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import android.util.Size;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoDetailActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiHELIOSOSc8PCovJiI+LSs4Zx87JzEjDSonKSwgCCwnITMlPTY=";
    public FrameLayout LL;
    public String LLILLJJLI;
    public List<? extends UrlModel> LLILLL;
    public int LLILZ;
    public Aweme LLILZIL;
    public Comment LLILZLL;
    public C1339550kxl LLIZ;
    public CommentContextSource LLIZLLLIL;
    public long LLJ = System.currentTimeMillis();
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 215));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 216));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 212));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 213));
    public long LLJILLL = -1;
    public String LLJJ = "";
    public String LLJJI = "";
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 214));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1339550kxl c1339550kxl;
        Comment comment;
        Integer enterSecondaryPos;
        super.onDestroy();
        if (this.LLJILLL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILLL;
            String str = this.LLJJ;
            String str2 = this.LLJJI;
            Integer numValueOf = Integer.valueOf(this.LLILZ);
            Aweme aweme = this.LLILZIL;
            C1350920lG6.LLIIJI(str, str2, jCurrentTimeMillis, numValueOf, aweme != null ? aweme.getGroupId() : null, false, null, 96);
            if (this.LLILZIL == null || (c1339550kxl = this.LLIZ) == null || (comment = this.LLILZLL) == null) {
                return;
            }
            CommentContextSource commentContextSource = this.LLIZLLLIL;
            Integer enterParentPos = c1339550kxl.getEnterParentPos();
            int iIntValue = 0;
            int iIntValue2 = enterParentPos != null ? enterParentPos.intValue() : 0;
            C1339550kxl c1339550kxl2 = this.LLIZ;
            if (c1339550kxl2 != null && (enterSecondaryPos = c1339550kxl2.getEnterSecondaryPos()) != null) {
                iIntValue = enterSecondaryPos.intValue();
            }
            C1350920lG6.LJJLIL("comment_duration", commentContextSource, comment, iIntValue2, iIntValue, System.currentTimeMillis() - this.LLJ, 0, 0, false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        List<? extends UrlModel> list;
        String stringExtra;
        Aweme aweme;
        Comment comment;
        C1339550kxl c1339550kxl;
        CommentContextSource commentContextSource;
        final UrlModel urlModel;
        UrlModel urlModel2;
        int width;
        int height;
        Activity activity;
        Comment comment2;
        C1339550kxl c1339550kxl2;
        int iIntValue;
        int iIntValue2;
        String tagType;
        Integer enterSecondaryPos;
        UrlModel urlModel3;
        String cid;
        boolean z;
        CommentCommonModel commonModel;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.a15);
        C1360720lVu.LIZ(this);
        this.LLILLJJLI = (String) getIntent().getSerializableExtra("disp_crop_image_uri");
        Serializable serializableExtra = getIntent().getSerializableExtra("image_uri");
        EnumC1342450l2R currSortType = null;
        if (serializableExtra instanceof List) {
            list = (List) serializableExtra;
        } else {
            list = null;
        }
        this.LLILLL = list;
        getIntent().getIntExtra("request_code", -1);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLJJ = stringExtra;
        try {
            String stringExtra2 = getIntent().getStringExtra("source");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLJJI = str;
        this.LLILZ = getIntent().getIntExtra("is_photo_contained", 0);
        Serializable serializableExtra2 = getIntent().getSerializableExtra("enter_inner_aweme");
        if (serializableExtra2 instanceof Aweme) {
            aweme = (Aweme) serializableExtra2;
        } else {
            aweme = null;
        }
        this.LLILZIL = aweme;
        Serializable serializableExtra3 = getIntent().getSerializableExtra("enter_inner_comment");
        if (serializableExtra3 instanceof Comment) {
            comment = (Comment) serializableExtra3;
        } else {
            comment = null;
        }
        this.LLILZLL = comment;
        Serializable serializableExtra4 = getIntent().getSerializableExtra("photo_detail_out_mob_model");
        if (serializableExtra4 instanceof C1339550kxl) {
            c1339550kxl = (C1339550kxl) serializableExtra4;
        } else {
            c1339550kxl = null;
        }
        this.LLIZ = c1339550kxl;
        Serializable serializableExtra5 = getIntent().getSerializableExtra("dispatch_context_source");
        if (serializableExtra5 instanceof CommentContextSource) {
            commentContextSource = (CommentContextSource) serializableExtra5;
        } else {
            commentContextSource = null;
        }
        this.LLIZLLLIL = commentContextSource;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            commonModel.setInPhotoCommentDetailPage(true);
        }
        if (C294220Bg4.LIZ()) {
            int i = C1341200l0Q.LIZ;
            List<? extends UrlModel> list2 = this.LLILLL;
            Comment comment3 = this.LLILZLL;
            String str2 = this.LLILLJJLI;
            if (list2 != null && (urlModel3 = (UrlModel) C13LP.LJJJLL(list2)) != null) {
                int width2 = urlModel3.getWidth();
                if (width2 < 0) {
                    width2 = 0;
                }
                int height2 = urlModel3.getHeight();
                if (height2 < 0) {
                    height2 = 0;
                }
                C1341220l0S c1341220l0S = new C1341220l0S(urlModel3, new Size(width2, height2));
                EnumC1341600l14 enumC1341600l14 = EnumC1341600l14.DETAIL_FULL_LEGACY;
                if (comment3 != null) {
                    cid = comment3.getCid();
                } else {
                    cid = null;
                }
                if (str2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                C1344350l5V.LIZ(new C1341210l0R(enumC1341600l14, c1341220l0S, null, cid, z, str2), (SmartImageView) this.LLJI.getValue(), (InterfaceC427850Gq7) this.LLJJIII.getValue(), new InterfaceC658750Psf() { // from class: X.0l0n
                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z2, String str3, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void Ck(JSONObject jSONObject) {
                        UrlModel urlModel4;
                        List<? extends UrlModel> list3 = this.LL.LLILLL;
                        if (list3 != null && (urlModel4 = (UrlModel) C13LP.LJJJLZIJ(0, list3)) != null) {
                            boolean zOptBoolean = jSONObject.optBoolean("isSuccess");
                            int iOptInt = jSONObject.optInt("from", -1);
                            if (zOptBoolean) {
                                C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                                String strValueOf = String.valueOf(urlModel4.hashCode());
                                c2208281Bbm.getClass();
                                C2208281Bbm.LIZJ(1, iOptInt, strValueOf, null, null);
                                return;
                            }
                            C2208281Bbm c2208281Bbm2 = C2208281Bbm.LIZ;
                            String strValueOf2 = String.valueOf(urlModel4.hashCode());
                            c2208281Bbm2.getClass();
                            C2208281Bbm.LIZJ(0, iOptInt, strValueOf2, "-1", "image load failed");
                        }
                    }
                }, false);
            }
        } else {
            List<? extends UrlModel> list3 = this.LLILLL;
            if (list3 != null) {
                urlModel = (UrlModel) C13LP.LJJJLZIJ(0, list3);
            } else {
                urlModel = null;
            }
            C708740Rr6 c708740Rr6 = C708740Rr6.LIZ;
            List<? extends UrlModel> list4 = this.LLILLL;
            if (list4 != null) {
                urlModel2 = (UrlModel) ListProtector.get(list4, 0);
            } else {
                urlModel2 = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel2));
            c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIIZZ.LIZLLL("PhotoDetailActivity");
            if (urlModel != null) {
                width = urlModel.getWidth();
                height = urlModel.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            c708740Rr6.LIZ(c1331670kl3LJIIIIZZ, urlModel, width, height);
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJI.getValue());
            c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.0l0m
                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z2, String str3, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC658750Psf
                public final void Ck(JSONObject jSONObject) {
                    boolean zOptBoolean = jSONObject.optBoolean("isSuccess");
                    int iOptInt = jSONObject.optInt("from", -1);
                    if (zOptBoolean) {
                        UrlModel urlModel4 = urlModel;
                        if (urlModel4 != null) {
                            C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                            String strValueOf = String.valueOf(urlModel4.hashCode());
                            c2208281Bbm.getClass();
                            C2208281Bbm.LIZJ(1, iOptInt, strValueOf, null, null);
                            return;
                        }
                        return;
                    }
                    UrlModel urlModel5 = urlModel;
                    if (urlModel5 == null) {
                        return;
                    }
                    C2208281Bbm c2208281Bbm2 = C2208281Bbm.LIZ;
                    String strValueOf2 = String.valueOf(urlModel5.hashCode());
                    c2208281Bbm2.getClass();
                    C2208281Bbm.LIZJ(0, iOptInt, strValueOf2, "-1", "image load failed");
                }
            };
            String str3 = this.LLILLJJLI;
            if (str3 != null) {
                c1331670kl3LJIIIIZZ.LJJJJL = str3;
            }
            c1331670kl3LJIIIIZZ.LJIIL((InterfaceC427850Gq7) this.LLJJIII.getValue());
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrvLfj4/2Oa3m2KR32TTZBqpc6xigl2XZ25gebugM/M=", null);
        C0WST c0wst = new C0WST();
        int iIntValue3 = 101;
        Object[] objArr = {101};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/comment/photocomment/PhotoDetailActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/comment/photocomment/PhotoDetailActivity", "setResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    iIntValue3 = ((Integer) obj2).intValue();
                }
            } else {
                activity = this;
            }
            activity.setResult(iIntValue3);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/comment/photocomment/PhotoDetailActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        C786410Ut5.O7((FrameLayout) callbackFindViewById, new ACListenerS155S0100000_21(this, 36));
        C786410Ut5.Q8((SmartImageView) this.LLJI.getValue(), new ACListenerS155S0100000_21(this, 37));
        C786410Ut5.a9((TuxIconView) this.LLJILJIL.getValue(), new ACListenerS155S0100000_21(this, 38));
        this.LLJ = System.currentTimeMillis();
        Aweme aweme2 = this.LLILZIL;
        if (aweme2 != null && (comment2 = this.LLILZLL) != null && (c1339550kxl2 = this.LLIZ) != null) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String str4 = this.LLJJ;
            Integer enterParentPos = c1339550kxl2.getEnterParentPos();
            if (enterParentPos != null) {
                iIntValue = enterParentPos.intValue();
            } else {
                iIntValue = 0;
            }
            C1339550kxl c1339550kxl3 = this.LLIZ;
            if (c1339550kxl3 != null && (enterSecondaryPos = c1339550kxl3.getEnterSecondaryPos()) != null) {
                iIntValue2 = enterSecondaryPos.intValue();
            } else {
                iIntValue2 = 0;
            }
            C1339550kxl c1339550kxl4 = this.LLIZ;
            if (c1339550kxl4 != null) {
                tagType = c1339550kxl4.getTagType();
            } else {
                tagType = null;
            }
            String sessionId = CommentContextSourceKt.getSessionId(this.LLIZLLLIL);
            CommentContextSource commentContextSource2 = this.LLIZLLLIL;
            if (commentContextSource2 != null) {
                currSortType = commentContextSource2.getCurrSortType();
            }
            c1350920lG6.getClass();
            C1350920lG6.LLIIIJ(aweme2, comment2, str4, iIntValue, iIntValue2, tagType, sessionId, true, currSortType, null);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onCreate", false);
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
