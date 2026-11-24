package ma.emsi.nadahelali.llm;

public record LlmInteraction(
        String questionJson,
        String reponseJson,
        String reponseExtraite
) {
}