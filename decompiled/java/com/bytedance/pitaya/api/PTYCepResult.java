package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class PTYCepResult implements ReflectionCall {
    public final String bizName;
    public final String errorMessage;
    public final List<JSONObject> extraSequences;
    public final List<JSONArray> matchedEventsSequences;
    public final String ruleName;
    public final boolean success;
    public final String warnings;

    public static final class Builder implements ReflectionCall {
        public String bizName = "";
        public String ruleName = "";
        public String warnings = "";
        public String errorMessage = "";
        public LinkedList<JSONArray> matchedEventsSequences = new LinkedList<>();
        public LinkedList<JSONObject> extraSequences = new LinkedList<>();

        public final PTYCepResult build() {
            return new PTYCepResult(this);
        }

        public final String getBizName() {
            return this.bizName;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final LinkedList<JSONObject> getExtraSequences() {
            return this.extraSequences;
        }

        public final LinkedList<JSONArray> getMatchedEventsSequences() {
            return this.matchedEventsSequences;
        }

        public final String getRuleName() {
            return this.ruleName;
        }

        public final String getWarnings() {
            return this.warnings;
        }

        public final void addExtra(Object obj) {
            try {
                if (obj instanceof JSONObject) {
                    this.extraSequences.add(obj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }

        public final void addSequence(Object obj) {
            if (obj instanceof JSONArray) {
                this.matchedEventsSequences.add(obj);
            }
        }

        public final void setBizName(String str) {
            this.bizName = str;
        }

        public final void setErrorMessage(String str) {
            this.errorMessage = str;
        }

        public final void setExtraSequences(LinkedList<JSONObject> linkedList) {
            this.extraSequences = linkedList;
        }

        public final void setMatchedEventsSequences(LinkedList<JSONArray> linkedList) {
            this.matchedEventsSequences = linkedList;
        }

        public final void setRuleName(String str) {
            this.ruleName = str;
        }

        public final void setWarnings(String str) {
            this.warnings = str;
        }
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<JSONObject> getExtraSequences() {
        return this.extraSequences;
    }

    public final List<JSONArray> getMatchedEventsSequences() {
        return this.matchedEventsSequences;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getWarnings() {
        return this.warnings;
    }

    public PTYCepResult(Builder builder) {
        this.bizName = builder.getBizName();
        this.ruleName = builder.getRuleName();
        this.warnings = builder.getWarnings();
        this.errorMessage = builder.getErrorMessage();
        this.matchedEventsSequences = builder.getMatchedEventsSequences();
        this.extraSequences = builder.getExtraSequences();
        this.success = !r1.isEmpty();
    }
}
