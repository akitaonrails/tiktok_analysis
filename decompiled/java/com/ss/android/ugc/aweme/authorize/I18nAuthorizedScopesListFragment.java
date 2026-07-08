package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C0JEF;
import X.C0WP3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B3S;
import X.C1B3X;
import X.C786410Ut5;
import Y.ACListenerS166S0100000_32;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.apm.agent.instrumentation.HttpInstrumentation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class I18nAuthorizedScopesListFragment extends Fragment implements C0JEF {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8Oiw2LGHELIOSEaeX0iCDonICo+IDU2LBYvJj82OwklOjsVOiQrJCo9PA==";
    public RelativeLayout LL;
    public TuxIconView LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public C1B3S LLILZIL;
    public AwemeAuthorizePlatformDepend LLILZLL;
    public C19H7 LLIZ;
    public List<OAuthScope> LLIZLLLIL;
    public boolean LLJ;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILZLL;
        C1B3S c1b3s = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        C19H7 c19h7 = this.LLIZ;
        if (c19h7 == null) {
            c19h7 = null;
        }
        C1B3S c1b3s2 = this.LLILZIL;
        if (c1b3s2 != null) {
            c1b3s = c1b3s2;
        }
        ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend, c19h7, c1b3s, C1B3X.LIZ(getArguments()))).get(AuthCommonViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        this.LLILZIL = new C1B3S(getArguments());
        this.LLILZLL = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILZLL;
        List<OAuthScope> list = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLIZ = new C19H7(awemeAuthorizePlatformDepend);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("pattern", "");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("authorized_scopes_key");
        } else {
            serializable = null;
        }
        if (serializable instanceof List) {
            list = (List) serializable;
        }
        this.LLIZLLLIL = list;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OAuthScope next;
        boolean z;
        String packageName;
        String lowerCase;
        super.onViewCreated(view, bundle);
        if (this.LLJ) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.bbt);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (RelativeLayout) viewFindViewById;
            }
            C786410Ut5.LLIIL((RelativeLayout) viewFindViewById, 8);
        }
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.bn2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS166S0100000_32(this, 111));
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.bcg);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (LinearLayout) viewFindViewById3;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById3);
        List<OAuthScope> list = this.LLIZLLLIL;
        if (list != null) {
            Iterator<OAuthScope> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str = next.appName;
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                    } else {
                        lowerCase = null;
                    }
                    if (!Intrinsics.LJFF(lowerCase, "tiktok")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            for (OAuthScope oAuthScope : list) {
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
                View viewFindViewById4 = this.LLILZ;
                if (viewFindViewById4 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById4 = view5.findViewById(R.id.h5o);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLILZ = (LinearLayout) viewFindViewById4;
                }
                View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.cy5, (ViewGroup) viewFindViewById4, false);
                final ImageView imageView = (ImageView) viewTd.findViewById(R.id.jwo);
                if (z) {
                    if (oAuthScope.appIcon != null) {
                        C0WP3.LIZIZ(new PthreadAsyncTask<String, Void, Bitmap>(imageView) { // from class: X.098H
                            public final ImageView LIZ;

                            {
                                this.LIZ = imageView;
                            }

                            @Override // android.os.AsyncTask
                            public final Object doInBackground(Object[] objArr) {
                                Bitmap bitmapDecodeStream = null;
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) HttpInstrumentation.openConnection(C2204961BRm.e0(new URL(((String[]) objArr)[0]), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu9d5fBzjv//UXF0wQ0l3XzbYH15B3dzrJF4y1N3FREsdY9yTWYo/zaZg==", null)));
                                    httpURLConnection.setDoInput(true);
                                    httpURLConnection.connect();
                                    bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                                    return bitmapDecodeStream;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return bitmapDecodeStream;
                                }
                            }

                            @Override // android.os.AsyncTask
                            public final void onPostExecute(Object obj) {
                                Bitmap bitmap = (Bitmap) obj;
                                if (bitmap != null) {
                                    this.LIZ.setImageBitmap(bitmap);
                                }
                            }
                        }, oAuthScope.appIcon);
                    }
                } else {
                    C786410Ut5.LJZI(8, imageView);
                }
                TextView textView = (TextView) viewTd.findViewById(R.id.z_h);
                String str2 = oAuthScope.scopeContent;
                if (str2 != null) {
                    textView.setText(str2);
                } else {
                    try {
                        Resources resources = getResources();
                        String str3 = oAuthScope.scopeName;
                        Context context = getContext();
                        if (context == null || (packageName = context.getPackageName()) == null) {
                            packageName = "";
                        }
                        textView.setText(getString(C786410Ut5.n3(resources, str3, "string", packageName)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                View viewFindViewById5 = this.LLILLL;
                if (viewFindViewById5 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById5 = view6.findViewById(R.id.bcg);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLILLL = (LinearLayout) viewFindViewById5;
                }
                ((ViewGroup) viewFindViewById5).addView(viewTd);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.c83, layoutInflater, null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
