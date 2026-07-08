package com.bytedance.tt.reliability.monitor.viewchecker;

import X.AnonymousClass1996;
import X.C2110908Ot;
import X.C2111008Ou;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.InterceptResult;
import com.bytedance.tt.reliability.monitor.viewchecker.model.PopupBlockConfig;
import com.bytedance.tt.reliability.monitor.viewchecker.model.TargetType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class DialogChecker {
    public static PopupBlockConfig sBlockConfig;
    public static CopyOnWriteArrayList<PopupBlockConfig.BlockRule> sBlockRules = new CopyOnWriteArrayList<>();
    public static boolean enableCheck = false;
    public static boolean enableShowMonitor = false;
    public static boolean enableTrace = false;
    public static long sAppStartTime = 0;
    public static CheckerCallback sCallback = null;

    /* JADX INFO: loaded from: classes4.dex */
    public interface CheckerCallback {
        void onEvent(String str, JSONObject jSONObject);

        void onPopupTraceException(Throwable th, Map<String, String> map);
    }

    public static long getDurationFromColdStart() {
        if (sAppStartTime <= 0) {
            return 0L;
        }
        return Math.max(SystemClock.uptimeMillis() - sAppStartTime, 0L);
    }

    public void show() {
        try {
            int i = C2111008Ou.LIZ;
            reportShowMonitorIfNeed((Dialog) new Object(), null, null);
            if (enableCheck) {
                Dialog dialog = (Dialog) new Object();
                InterceptResult interceptResultInterceptDialogShow = interceptDialogShow(dialog);
                if (interceptResultInterceptDialogShow.isIntercept()) {
                    reportInterceptSuccess(dialog.getClass().getName(), interceptResultInterceptDialogShow);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i2 = C2110908Ot.LIZ;
    }

    public static Activity findHostActivity(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        Context context = dialog.getContext();
        for (int i = 0; context != null && ownerActivity == null && i < 3; i++) {
            if (context instanceof Activity) {
                ownerActivity = (Activity) context;
            } else {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return ownerActivity;
    }

    public static InterceptResult interceptDialogShow(Dialog dialog) {
        return interceptCore(findHostActivity(dialog), TargetType.DIALOG);
    }

    public static void reportInterceptPass(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("target_class", str);
            report("popup_intercept_pass", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static FragmentManager tryGetFragmentManager(Object obj) {
        try {
            Class<?> cls = Class.forName("androidx.fragment.app.a");
            if (cls.isInstance(obj)) {
                Field declaredField = cls.getDeclaredField("mManager");
                declaredField.setAccessible(true);
                return (FragmentManager) declaredField.get(obj);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public static Activity findHostActivity(FragmentManager fragmentManager, DialogFragment dialogFragment) {
        try {
            Method declaredMethod = AnonymousClass1996.class.getDeclaredMethod("LIZLLL", new Class[0]);
            declaredMethod.setAccessible(true);
            return (Activity) declaredMethod.invoke(fragmentManager.LJJLIIIJLJLI(), new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static InterceptResult interceptCore(Activity activity, TargetType targetType) {
        boolean z = false;
        PopupBlockConfig.BlockRule blockRule = null;
        String hostActivity = null;
        for (PopupBlockConfig.BlockRule blockRule2 : sBlockRules) {
            if (targetType == blockRule2.getTargetType() && blockRule2.isEnable()) {
                if (!TextUtils.isEmpty(blockRule2.getHostActivity())) {
                    if (activity != null && activity.getClass().getName().equals(blockRule2.getHostActivity())) {
                        hostActivity = blockRule2.getHostActivity();
                    }
                }
                blockRule = blockRule2;
                z = true;
            }
        }
        if (z && blockRule != null && blockRule.isForceFinish() && activity != null) {
            activity.finish();
        }
        return new InterceptResult(z, hostActivity, blockRule);
    }

    public static InterceptResult interceptDialogShow(FragmentManager fragmentManager, DialogFragment dialogFragment) {
        Activity activity;
        if (fragmentManager != null && fragmentManager.LJJLIIIJLJLI() != null) {
            try {
                Method declaredMethod = AnonymousClass1996.class.getDeclaredMethod("LIZLLL", new Class[0]);
                declaredMethod.setAccessible(true);
                activity = (Activity) declaredMethod.invoke(fragmentManager.LJJLIIIJLJLI(), new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                activity = null;
            }
        } else {
            activity = null;
        }
        return interceptCore(activity, TargetType.DIALOG);
    }

    public static void report(String str, JSONObject jSONObject) {
        CheckerCallback checkerCallback = sCallback;
        if (checkerCallback != null) {
            checkerCallback.onEvent(str, jSONObject);
        }
    }

    public static void reportConfigInitSuccess(PopupBlockConfig popupBlockConfig, List<PopupBlockConfig.BlockRule> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config_enable", popupBlockConfig.isEnable());
            jSONObject.put("rule_count", sBlockRules.size());
            jSONObject.put("valid_rule_count", list.size());
            JSONArray jSONArray = new JSONArray();
            for (PopupBlockConfig.BlockRule blockRule : list) {
                if (blockRule != null) {
                    jSONArray.put(blockRule.getRuleId());
                }
            }
            jSONObject.put("valid_rule_ids", jSONArray.toString());
            report("popup_block_config_init", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void reportInterceptSuccess(String str, InterceptResult interceptResult) {
        if (interceptResult != null && interceptResult.getRule() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("target_class", str);
                jSONObject.put("reason", interceptResult.getReason());
                jSONObject.put("rule_id", interceptResult.getRule().getRuleId());
                jSONObject.put("force_finish", interceptResult.getRule().isForceFinish());
                report("popup_intercept_success", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        try {
            int i = C2111008Ou.LIZ;
            reportShowMonitorIfNeed(null, fragmentManager, (DialogFragment) new Object());
            if (enableCheck) {
                DialogFragment dialogFragment = (DialogFragment) new Object();
                InterceptResult interceptResultInterceptDialogShow = interceptDialogShow(fragmentManager, dialogFragment);
                if (interceptResultInterceptDialogShow.isIntercept()) {
                    reportInterceptSuccess(dialogFragment.getClass().getName(), interceptResultInterceptDialogShow);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i2 = C2110908Ot.LIZ;
    }

    public static void reportShowMonitorIfNeed(Dialog dialog, FragmentManager fragmentManager, DialogFragment dialogFragment) {
        Activity activityFindHostActivity;
        String name;
        if (!enableShowMonitor && !enableTrace) {
            return;
        }
        String name2 = "";
        if (dialog != null) {
            activityFindHostActivity = findHostActivity(dialog);
            name = dialog.getClass().getName();
        } else if (fragmentManager != null && dialogFragment != null) {
            activityFindHostActivity = findHostActivity(fragmentManager, dialogFragment);
            name = dialogFragment.getClass().getName();
        } else {
            activityFindHostActivity = null;
            name = "";
        }
        long durationFromColdStart = getDurationFromColdStart();
        if (enableShowMonitor) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (activityFindHostActivity != null) {
                    name2 = activityFindHostActivity.getClass().getName();
                }
                jSONObject.put("host_activity", name2);
                jSONObject.put("popup_name", name);
                jSONObject.put("type", TargetType.DIALOG.name());
                jSONObject.put("cold_start_duration_ms", durationFromColdStart);
                report("popup_show_monitor_event", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (enableTrace) {
            PopupTraceSampler.tryReport(name, activityFindHostActivity, durationFromColdStart);
        }
    }

    public static void init(boolean z, PopupBlockConfig popupBlockConfig, long j, CheckerCallback checkerCallback) {
        init(z, false, null, popupBlockConfig, j, checkerCallback);
    }

    public static void init(boolean z, boolean z2, Context context, PopupBlockConfig popupBlockConfig, long j, CheckerCallback checkerCallback) {
        boolean z3;
        PopupBlockConfig popupBlockConfig2;
        sBlockConfig = popupBlockConfig;
        sAppStartTime = j;
        sCallback = checkerCallback;
        boolean z4 = false;
        enableCheck = false;
        if (popupBlockConfig != null) {
            for (PopupBlockConfig.BlockRule blockRule : popupBlockConfig.getRules()) {
                if (blockRule.isEnable()) {
                    sBlockRules.add(blockRule);
                }
            }
            enableCheck = sBlockConfig.isEnable();
        }
        enableShowMonitor = z;
        if (enableCheck && !sBlockRules.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        enableCheck = z3;
        if (z2 && context != null && (popupBlockConfig2 = sBlockConfig) != null && popupBlockConfig2.getTraceConfig() != null && sCallback != null) {
            z4 = true;
        }
        enableTrace = z4;
        if (z4) {
            PopupTraceSampler.init(context, sBlockConfig.getTraceConfig(), sCallback);
        }
        reportConfigInitSuccess(sBlockConfig, sBlockRules);
    }
}
